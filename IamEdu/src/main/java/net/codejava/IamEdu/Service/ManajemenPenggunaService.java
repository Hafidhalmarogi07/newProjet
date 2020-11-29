package net.codejava.IamEdu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.codejava.IamEdu.Model.ManajemenPenggunaModel;
import net.codejava.IamEdu.Repository.ManajemenPenggunaRepository;

@Service
@Transactional
public class ManajemenPenggunaService {
	
	@Autowired
	ManajemenPenggunaRepository MPRepo;
	
	public List<ManajemenPenggunaModel> listAll() {
		return MPRepo.findAll();
		
	}
	
	public void save(ManajemenPenggunaModel manajemenPengguna) {
		MPRepo.save(manajemenPengguna);
		
	}
	
	public ManajemenPenggunaModel get(long id) {
		return MPRepo.findById(id).get();
		
	}
	
	public void delete(long id) {
		MPRepo.deleteById(id);
		
	}

}
