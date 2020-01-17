package fr.formation.inti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="EMP_ID")
	Integer idEmployee;
	@Column(name="FIRST_NAME")
	String firstName;
	@Column(name="LAST_NAME")
	String lastName;
	@Column(name="START_DATE")
	String startDate;
	@Column(name="TITLE")
	String title;
	@Column(name="SUPERIOR_EMP_ID")
	Integer superiorId;
	
	@OneToMany(mappedBy="employee")
	@JoinColumn(name="DEPT_ID")
	List<Department> listeDepartment;
	
	
	
	public Employee() {
		super();
			
	}

	public Employee(Integer idEmployee, String firstName, String lastName, String startDate, String title) {
		super();
		this.idEmployee = idEmployee;
		this.firstName = firstName;
		this.lastName = lastName;
		this.startDate = startDate;
		this.title = title;
		
	}
	

	public Employee(Integer idEmployee, String firstName, String lastName, String startDate, String title,
			Department department, Integer superiorId) {
		super();
		this.idEmployee = idEmployee;
		this.firstName = firstName;
		this.lastName = lastName;
		this.startDate = startDate;
		this.title = title;
		this.listeDepartment=listeDepartment;
		this.superiorId=superiorId;
	}

	public Integer getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Department> getListeDepartment() {
		return listeDepartment;
	}

	public void setListeDepartment(List<Department> listeDepartment) {
		this.listeDepartment = listeDepartment;
	}

	
	public Integer getSuperiorId() {
		return superiorId;
	}

	public void setSuperiorId(Integer superiorId) {
		this.superiorId = superiorId;
	}

	@Override
	public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", startDate=" + startDate + ", title=" + title + ", superiorId=" + superiorId + ", listeDepartment="
				+ listeDepartment + "]";
	}





	
	
	
}
	