package com.tcs.hibernate_simple_crud_operation;

import java.time.LocalDate;

import com.tcs.hibernate_simple_crud_operation_dao.ProductDao;
import com.tcs.hibernate_simple_crud_operation_entity.Product;

public class InsertProductController {
	
	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.setId(5674);
		product.setName("Adaptor");
		product.setColor("green");
		product.setMfd(LocalDate.parse("2022-05-10"));
		product.setExpd(LocalDate.parse("2026-09-09"));
		product.setPrice(1200);
		
		ProductDao dao = new ProductDao();
		dao.saveProductDao(product);
	}

}
