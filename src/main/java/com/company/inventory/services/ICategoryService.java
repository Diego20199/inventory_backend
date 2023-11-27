package com.company.inventory.services;

import org.springframework.http.ResponseEntity;

import com.company.inventory.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();//ResponseEntity no sa un estructura http custom
		
	

}
