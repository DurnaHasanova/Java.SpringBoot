package com.SpringBoot.Northwind.DataAccess.Abstracts;

import com.SpringBoot.Northwind.Entities.Concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
