package com.tcs.hibernate_simple_crud_operation;

import com.tcs.hibernate_simple_crud_operation_dao.ProductDao;

public class DeleteProductByPriceController {
	
public static void main(String[] args) {
		
		boolean b=new ProductDao().deleteProductByIdDao(44444);
		
		String msg = b?"deleted":"check your price";
		
		System.out.println(msg);
	}

}
