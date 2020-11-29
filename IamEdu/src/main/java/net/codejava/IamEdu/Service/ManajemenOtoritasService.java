package net.codejava.IamEdu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.codejava.IamEdu.Model.ManajemenOtoritasModel;
import net.codejava.IamEdu.Repository.ManajemenOtoritasRepository;

@Service
@Transactional
public class ManajemenOtoritasService {
	
	@Autowired
	ManajemenOtoritasRepository MORepo;
	
	public List<ManajemenOtoritasModel> listAll() {
		return MORepo.findAll();
		
	}
	
	public void save(ManajemenOtoritasModel manajemenOtoritas) {
		MORepo.save(manajemenOtoritas);
		
	}
	
	public ManajemenOtoritasModel get(long id) {
		
		return MORepo.findById(id).get();
		
	}
	
	public void delete(long id) {
		
		MORepo.deleteById(id);
		
	}

}
