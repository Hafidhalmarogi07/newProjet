package net.codejava.IamEdu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.IamEdu.Model.TabelPercobaan;

public interface PercobaanRepo extends JpaRepository<TabelPercobaan, Long> {

}
