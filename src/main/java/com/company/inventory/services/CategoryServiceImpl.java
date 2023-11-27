package com.company.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.inventory.dao.ICategoryDao;
import com.company.inventory.model.Category;
import com.company.inventory.response.CategoryResponseRest;



@Service
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired //instacia este objero en un contenedor de spring para poder usarlo para uno usa el new
	private ICategoryDao categoryDao;

	@Override
	@Transactional(readOnly = true)// para que la DB lo menejr como una transaccion para hacer rollback
	public ResponseEntity<CategoryResponseRest> search() {
		CategoryResponseRest response = new CategoryResponseRest();
		try {
			List<Category> category =(List<Category>) categoryDao.findAll();//busca todas la categorias de la DB
			System.out.println("asdasda");
			response.getCategoryResponse().setCategory(category); //aca setemamos a respuesta en formato de categoria
			response.setMetadata("Respuesta ok", "00", "exito");//aca insertamos la respies al metadata
		} catch (Exception e) {
			response.setMetadata("Respuesta nok", "-1", "no exito");
			e.getStackTrace();
			return new ResponseEntity<CategoryResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		return new ResponseEntity<CategoryResponseRest>(response, HttpStatus.OK);
	}

}
