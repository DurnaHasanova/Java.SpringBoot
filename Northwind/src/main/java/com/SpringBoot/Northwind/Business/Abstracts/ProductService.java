package com.SpringBoot.Northwind.Business.Abstracts;
import com.SpringBoot.Northwind.Core.Utilities.Results.DataResult;
import com.SpringBoot.Northwind.Core.Utilities.Results.Result;
import com.SpringBoot.Northwind.Entities.Concretes.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProductService {

		DataResult<List<Product>> GetAll();

		Result add(Product product);
		DataResult<Product> getByProductName(String productName);
		DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);
		DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);
		DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
		DataResult<List<Product>> getByProductNameContains(String productName);
		DataResult<List<Product>>getByProductNameStartsWith(String productName);

		DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

}
