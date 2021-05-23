package com.SpringBoot.Northwind.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.Northwind.Entities.Concretes.Product;

public interface ProductDao  extends JpaRepository<Product, Integer>{

	
}
