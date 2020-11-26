package net.codejava.IamEdu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.codejava.IamEdu.Model.TabelPercobaan;
import net.codejava.IamEdu.Repository.PercobaanRepo;

@Service
@Transactional
public class PercobaanService {
	
	@Autowired
	private PercobaanRepo repo;
	
	 public List<TabelPercobaan> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(TabelPercobaan percobaan) {
	        repo.save(percobaan);
	    }
	     
	    public TabelPercobaan get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }

}
