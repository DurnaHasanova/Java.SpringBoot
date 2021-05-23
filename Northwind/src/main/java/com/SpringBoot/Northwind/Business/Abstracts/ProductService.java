package com.SpringBoot.Northwind.Business.Abstracts;
import com.SpringBoot.Northwind.Core.Utilities.Results.DataResult;
import com.SpringBoot.Northwind.Core.Utilities.Results.Result;
import com.SpringBoot.Northwind.Entities.Concretes.Product;
import java.util.List;


public interface ProductService {

		DataResult<List<Product>> GetAll();

		Result add(Product product);
}
