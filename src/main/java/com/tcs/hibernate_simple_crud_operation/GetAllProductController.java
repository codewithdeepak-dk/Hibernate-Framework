package com.tcs.hibernate_simple_crud_operation;

import com.tcs.hibernate_simple_crud_operation_dao.ProductDao;

public class GetAllProductController {
	
	public static void main(String[] args) {
		new ProductDao()
		.getAllProductByDao()
		.forEach(System.out::println);
	}

}
