package fr.formation.inti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer cust_id;
	String address;
	String city;
	String postal_code;
	String state;
	String cust_type_cd;
	String fed_id;
	
	
	
	public Customer() {
		super();
	}



	public Customer(Integer cust_id, String address, String city, String postal_code, String state, String cust_type_cd,
			String fed_id) {
		super();
		this.cust_id = cust_id;
		this.address = address;
		this.city = city;
		this.postal_code = postal_code;
		this.state = state;
		this.cust_type_cd = cust_type_cd;
		this.fed_id = fed_id;
	}



	public Integer getCust_id() {
		return cust_id;
	}



	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getPostal_code() {
		return postal_code;
	}



	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCust_type_cd() {
		return cust_type_cd;
	}



	public void setCust_type_cd(String cust_type_cd) {
		this.cust_type_cd = cust_type_cd;
	}



	public String getFed_id() {
		return fed_id;
	}



	public void setFed_id(String fed_id) {
		this.fed_id = fed_id;
	}



	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", address=" + address + ", city=" + city + ", postal_code="
				+ postal_code + ", state=" + state + ", cust_type_cd=" + cust_type_cd + ", fed_id=" + fed_id + "]";
	}



	
	
	

}
