package net.codejava.IamEdu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.IamEdu.Model.TabelPercobaan;
import net.codejava.IamEdu.Service.PercobaanService;

@Controller
@RequestMapping("IamEdu")
public class PercobaanController {

	@Autowired
	private PercobaanService perService;
	
	@RequestMapping(value = {"/",""})
	public String ViewHome(Model model) {
		List<TabelPercobaan> listPercobaan=perService.listAll();
		model.addAttribute("listPercobaan", listPercobaan);
		
		return "index";
			
		
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		TabelPercobaan percobaan = new TabelPercobaan();
	    model.addAttribute("percobaan", percobaan);
	     
	    return "new_percobaan";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("percobaan") TabelPercobaan percobaan) {
		//percobaan.setIdRequestBooking(2);
		perService.save(percobaan);
	     
	    return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("edit_percobaan");
	    TabelPercobaan percobaan = perService.get(id);
	    mav.addObject("percobaan", percobaan);
	     
	    return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
	    perService.delete(id);
	    return "redirect:/";       
	}
}
