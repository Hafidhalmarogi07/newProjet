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

import net.codejava.IamEdu.Model.ManajemenOtoritasModel;
import net.codejava.IamEdu.Model.ManajemenPenggunaModel;
import net.codejava.IamEdu.Service.ManajemenOtoritasService;
import net.codejava.IamEdu.Service.ManajemenPenggunaService;

@Controller
@RequestMapping("IamEdu/ManajemenPengguna")
public class ManajemenPenggunaController {
	
	@Autowired
	ManajemenPenggunaService MPService;
	
	@Autowired
	ManajemenOtoritasService MOService;
	
	@RequestMapping(value = {"","/"})
	public String viewHome(Model model) {
		List<ManajemenPenggunaModel> manajemenPengguna=MPService.listAll();
		model.addAttribute("ListPengguna", manajemenPengguna);
		
		return "ManajemenPengguna";
		
	}
	
	@RequestMapping("/AddPengguna")
	public String addFromPengguna(Model model) {
		ManajemenPenggunaModel manajemenPengguna=new ManajemenPenggunaModel();
		model.addAttribute("manajemenPengguna", manajemenPengguna);
		
		List<ManajemenOtoritasModel> manajemenOtoritas=MOService.listAll();
		model.addAttribute("ListOtoritas", manajemenOtoritas);
		
		
		return "AddManajemenPengguna";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("manajemenPengguna") ManajemenPenggunaModel manajemenPengguna) {
		//percobaan.setIdRequestBooking(2);
		MPService.save(manajemenPengguna);
	     
	    return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditPenggunaPage(@PathVariable(name = "id") Long id) {
	    ModelAndView mav = new ModelAndView("UpdateManajemenPengguna");
	    ManajemenPenggunaModel manajemenPengguna = MPService.get(id);
	    mav.addObject("manajemenPengguna", manajemenPengguna);
	    List<ManajemenOtoritasModel> manajemenOtoritas=MOService.listAll();
	    mav.addObject("ListOtoritas", manajemenOtoritas);
	     
	    return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deletePengguna(@PathVariable(name = "id") Long id) {
		MPService.delete(id);
		
	    return "redirect:/";       
	}

}
