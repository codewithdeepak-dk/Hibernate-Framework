package com.tcs.hibernate_simple_crud_operation_entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
	
	@Id
	private int id;
	@Column(length = 20, nullable = false)
	private String name;
	private String color;
	@Column(name = "productprice")
	private double price;
	private LocalDate mfd;
	private LocalDate expd;
	
}
