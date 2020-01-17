package fr.formation.inti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer dept_id;
	String name;
	
	@ManyToOne
	Employee employee;
	
	public Department() {
		super();
	}
	public Department(Integer dept_id, String name) {
		super();
		this.dept_id = dept_id;
		this.name = name;
	}
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", name=" + name + "]";
	}
	
	

}
