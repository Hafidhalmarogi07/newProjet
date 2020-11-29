package net.codejava.IamEdu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.codejava.IamEdu.Model.ManajemenMenuModel;
import net.codejava.IamEdu.Repository.ManajemenMenuRepository;

@Service
@Transactional
public class ManajemenMenuService {

	@Autowired 
	ManajemenMenuRepository MMRepo;
	
	public List<ManajemenMenuModel> listAll() {
		return MMRepo.findAll();
		
	}
	
	public void save(ManajemenMenuModel manajemenMenu) {
		MMRepo.save(manajemenMenu);
	}
	
	public ManajemenMenuModel get(Long id) {
		return MMRepo.findById(id).get();
		
	}
	
	public void delete(long id) {
		MMRepo.deleteById(id);
		
	}
	
}
