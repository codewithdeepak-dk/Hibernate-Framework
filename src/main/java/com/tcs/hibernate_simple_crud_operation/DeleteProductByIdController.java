package com.tcs.hibernate_simple_crud_operation;

import com.tcs.hibernate_simple_crud_operation_dao.ProductDao;

public class DeleteProductByIdController {
	
	public static void main(String[] args) {
		boolean b=new ProductDao().deleteProductByIdDao(5674);
		
		String sg=b?"deleted":"check id not deleted";
		System.out.println(sg);
	}

}
