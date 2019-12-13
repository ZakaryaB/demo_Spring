package fr.zakaria.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	private int alid;
	private String aname;
	private String tech;
	
	public Alien() {
		// TODO Auto-generated constructor stub
	}

	public Alien(int alid, String aname) {
		super();
		this.alid = alid;
		this.aname = aname;
	}
	
	

	public Alien(int alid, String aname, String tech) {
		super();
		this.alid = alid;
		this.aname = aname;
		this.tech = tech;
	}

	public int getAlid() {
		return alid;
	}

	public void setAlid(int alid) {
		this.alid = alid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Alien [alid=" + alid + ", aname=" + aname + ", tech=" + tech + "]";
	}

	
	
	
}
