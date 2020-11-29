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

import net.codejava.IamEdu.Model.ManajemenMenuModel;
import net.codejava.IamEdu.Service.ManajemenMenuService;

@Controller
@RequestMapping("IamEdu/ManajemenMenu")
public class ManajemenMenuController {
	
	@Autowired 
	ManajemenMenuService MMService;
	
	@RequestMapping(value = {"","/"})
	public String viewHome(Model model) {
		List<ManajemenMenuModel> manajemenMenu=MMService.listAll();
		model.addAttribute("ListMenu", manajemenMenu);
		
		return "ManajemenMenu";
		
	}
	
	@RequestMapping("/AddMenu")
	public String addFromMenu(Model model) {
		ManajemenMenuModel manajemenMenu=new ManajemenMenuModel();
		model.addAttribute("manajemenMenu", manajemenMenu);
		
		List<ManajemenMenuModel> ListFolder=MMService.listAll();
		model.addAttribute("ListFolder",ListFolder);
		return "AddManajemenMenu";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveMenu(@ModelAttribute("manajemenMenu") ManajemenMenuModel manajemenMenu) {
		//percobaan.setIdRequestBooking(2);
		MMService.save(manajemenMenu);
	     
	    return "redirect: ";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditMenuPage(@PathVariable(name = "id") Long id) {
	    ModelAndView mav = new ModelAndView("UpdateManajemenMenu");
	    ManajemenMenuModel manajemenMenu = MMService.get(id);
	    mav.addObject("manajemenMenu", manajemenMenu);
	    
	    List<ManajemenMenuModel> ListFolder=MMService.listAll();
	    mav.addObject("ListFolder",ListFolder);
	     
	    return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteMenu(@PathVariable(name = "id") Long id) {
		MMService.delete(id);
	    return "redirect:/";       
	}

}
