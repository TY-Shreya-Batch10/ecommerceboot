package com.tyss.ecommercerest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
	@Entity
	@Table(name = "items_info")
	public class Item implements Serializable{

		@Id
		private int id;
		
		@Column
		private String name;
		
		@Column
		private int quantity;
		
		@Column
		private double price;
	}


