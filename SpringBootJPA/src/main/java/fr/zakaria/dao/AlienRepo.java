package fr.zakaria.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.zakaria.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

//	List<Alien> findByTech(String tech);
//	
//	List<Alien> findByAlidGreaterThan(int alid);
//	
//	@Query("from Alien where tech=?1 order by aname")
//	List<Alien> findByTechSorted(String tech);
	
	
}
