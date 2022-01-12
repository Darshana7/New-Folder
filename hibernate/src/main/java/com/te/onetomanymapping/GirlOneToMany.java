package com.te.onetomanymapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class GirlOneToMany {
	
	@Id
	private int  gid;
	private String name;
	
	@OneToMany(mappedBy = "girl")
	private List<BoyManyToOne> boy;
	

	public List<BoyManyToOne> getBoy() {
		return boy;
	}

	public void setBoy(List<BoyManyToOne> boy) {
		this.boy = boy;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Girl [Gid=" + gid + ", name=" + name + ", b=" + "]";
	}
	
}
