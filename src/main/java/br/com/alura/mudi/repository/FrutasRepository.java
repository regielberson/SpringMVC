package br.com.alura.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.alura.mudi.model.Frutas;


@Repository	
public interface FrutasRepository extends JpaRepository<Frutas, Long> {
	

}
	

