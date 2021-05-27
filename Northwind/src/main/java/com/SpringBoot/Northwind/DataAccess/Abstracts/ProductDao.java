package com.SpringBoot.Northwind.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.Northwind.Entities.Concretes.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao  extends JpaRepository<Product, Integer>{

	Product getByProductName(String productName);
    Product getByProductNameAndCategory(String productName, int categoryId);
    List<Product> getByProductNameOrCategory(String productName, int categoryId);
    List<Product> getByCategoryIdIn(List<Integer> categories);
    List<Product> getByProductNameContains(String productName);
    List<Product> getByProductNameStartsWith(String productName);

    @Query("from Product where productName=:productName and category.id=:categoryId")
    List<Product> getByNameAndCategory(String productName, int categoryId);
}
