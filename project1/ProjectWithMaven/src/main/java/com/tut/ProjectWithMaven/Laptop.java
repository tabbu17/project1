package com.tut.ProjectWithMaven;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="laptop_details")
public class Laptop implements Serializable {
@Id	
@Column(name="ID")
private Long id;

@Column(name="Brand")
private String brand;

@Column(name="Operating_Sys")
private String osys;

@Column(name="Price")
private Double price ;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getOsys() {
	return osys;
}

public void setOsys(String osys) {
	this.osys = osys;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

@Override
public String toString()
{
	return"Laptop[id=" + id + ",brand="+brand+",osys="+osys+",price="+price+"]";
	
}
}
