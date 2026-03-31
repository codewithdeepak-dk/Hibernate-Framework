package com.tcs.hibernate_simple_crud_operation;

import com.tcs.hibernate_simple_crud_operation_dao.ProductDao;
import com.tcs.hibernate_simple_crud_operation_entity.Product;

public class UpdateProductPriceByIdController {
	
public static void main(String[] args) {
		
		Product product=new ProductDao().updateProductPriceByIdDao(44444, 60500);
	
		System.out.println("updated product price is below");
		
		System.out.println(product);
		
		
	}

}
