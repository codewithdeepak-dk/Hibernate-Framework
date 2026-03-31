package com.tcs.hibernate_simple_crud_operation;


import java.util.List;

import com.tcs.hibernate_simple_crud_operation_dao.ProductDao;
import com.tcs.hibernate_simple_crud_operation_entity.Product;

public class getProductByColorController {
	
public static void main(String[] args) {
		
		List<Product> products=new ProductDao().getProductByColorDao("silver");
		
		if(products.size()>0) {
			products.forEach(a->System.out.println(a));
		}else {
			System.out.println("given color not avaialable");
		}
		
	}

}
