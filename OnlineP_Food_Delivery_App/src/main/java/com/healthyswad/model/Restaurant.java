package com.healthyswad.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer restaurantId;
	private String restaurantName;
	private String managerName;
	private String contractNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurant")
	private List<Item> itemList;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurant")
	private List<Item> orderLists;
	
	@ManyToMany(targetEntity = Customer.class, cascade = CascadeType.ALL) 
	private Set<Customer> customers;


	
}
