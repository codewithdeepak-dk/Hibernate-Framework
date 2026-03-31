package com.tcs.hibernate_simple_crud_operation;

import com.tcs.hibernate_simple_crud_operation_dao.ProductDao;
import com.tcs.hibernate_simple_crud_operation_entity.Product;

public class GetProductByIdController {
	
	public static void main(String[] args) {
		Product product=new ProductDao().getProductByIdDao(54322);
		
		if(product!=null) {
			System.out.println(product);
		}else {
			System.out.println("something-went-wrong check your id");
		}
	}

}
