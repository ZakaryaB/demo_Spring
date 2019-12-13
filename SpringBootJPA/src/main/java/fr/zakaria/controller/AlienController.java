package fr.zakaria.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.PostRemove;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.zakaria.dao.AlienRepo;
import fr.zakaria.model.Alien;

@RestController
@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home(){
		return "home.jsp";
	}
	
//	@RequestMapping("/addAlien")
//	public String addAlien(Alien a){
//		repo.save(a);
//		return "home.jsp";
//	}
	
//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(@RequestParam int alid){
//		ModelAndView mv = new ModelAndView("showAlien.jsp");
//		Alien alien = repo.findById(alid).orElse(new Alien());
//		mv.addObject(alien);
//		return mv;
//	}
	
//	@RequestMapping("/getAlien")
//	public ModelAndView getAliens(@RequestParam int alid){
//		ModelAndView mv = new ModelAndView("showAlien.jsp");
//		Alien alien = repo.findById(alid).orElse(new Alien());
//		
//		System.out.println(repo.findByTech("java"));
//		System.out.println(repo.findByAlidGreaterThan(300));
//		System.out.println(repo.findByTechSorted("java"));
//		
//		mv.addObject(alien);
//		
//		return mv;
//	}
	
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens(){
		
		return repo.findAll();
	}
	
	@GetMapping("/alien/{alid}")
	public Optional<Alien> getAlien(@PathVariable("alid") int alid){
		
		return repo.findById(alid);
	}
	
	
	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien a){
		repo.save(a);
		return a;
	}
	
	@DeleteMapping("/alien/{alid}")
	public String deleteAlien(@PathVariable("alid") int alid){
		Alien a = repo.getOne(alid);
		a.toString();
		repo.delete(a);
		return "Deleted !!";
	}
	
	@PutMapping(path="/alien",consumes={"application/json"})
	public Alien updateAlien(@RequestBody Alien a){
		repo.save(a);
		return a;
	}
}
