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
import net.codejava.IamEdu.Model.ManajemenOtoritasModel;
import net.codejava.IamEdu.Service.ManajemenMenuService;
import net.codejava.IamEdu.Service.ManajemenOtoritasService;

@Controller
@RequestMapping("IamEdu/ManajemenOtoritas")
public class ManajemenOtoritasController {
	
	@Autowired
	ManajemenOtoritasService MOService;
	
	@Autowired 
	ManajemenMenuService MMService;
	
	@RequestMapping(value = {"","/ManajemenOtoritas"})
	public String viewHome(Model model) {
		List<ManajemenOtoritasModel> manajemenOtoritas=MOService.listAll();
		model.addAttribute("listOtoritas", manajemenOtoritas);
		
		return "ManajemenOtoritas";
		
	}
	
	@RequestMapping("/AddOtoritas")
	public String addFromOtoritas(Model model) {
		ManajemenOtoritasModel manajemenOtoritas=new ManajemenOtoritasModel();
		model.addAttribute("manajemenOtoritas", manajemenOtoritas);
		
		List<ManajemenMenuModel> ListFolder=MMService.listAll();
		model.addAttribute("ListMenu",ListFolder);
		
		return "AddManajemenOtoritas";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("manajemenOtoritas") ManajemenOtoritasModel manajemenOtoritas) {
		//percobaan.setIdRequestBooking(2);
		MOService.save(manajemenOtoritas);
	     
	    return "redirect: ";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditOtoritasPage(@PathVariable(name = "id") Long id) {
	    ModelAndView mav = new ModelAndView("UpdateManajemenOtoritas");
	    ManajemenOtoritasModel manajemenOtoritas = MOService.get(id);
	    mav.addObject("manajemenOtoritas", manajemenOtoritas);
	    
	    List<ManajemenMenuModel> ListFolder=MMService.listAll();
	    mav.addObject("ListMenu",ListFolder);
	     
	    return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteOtoritas(@PathVariable(name = "id") Long id) {
		MOService.delete(id);
	    return "redirect:/IamEdu/ManajemenOtoritas";       
	}

}
