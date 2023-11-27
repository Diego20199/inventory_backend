package com.company.inventory.dao;

import org.springframework.data.repository.CrudRepository;//clase de spring Framework
//y tiene todos los metodo para acceder a los datos de nuestra categoria en este caso

import com.company.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{

}
