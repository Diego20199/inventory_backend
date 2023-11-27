package com.company.inventory.model;

import java.io.Serializable;

import jakarta.persistence.Entity;// se usa desde java 17
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
@Data
@Entity // sera mapada en la DB la tabla y es un entidad
@Table(name = "category")
public class Category implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4310027227752446841L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;

}
