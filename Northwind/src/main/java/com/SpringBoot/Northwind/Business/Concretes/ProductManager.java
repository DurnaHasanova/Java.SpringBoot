package com.SpringBoot.Northwind.Business.Concretes;

import java.util.List;

import com.SpringBoot.Northwind.Core.Utilities.Results.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Northwind.Business.Abstracts.ProductService;
import com.SpringBoot.Northwind.DataAccess.Abstracts.ProductDao;
import com.SpringBoot.Northwind.Entities.Concretes.Product;

@Service
public class ProductManager implements ProductService {

	
	private final ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public DataResult<List<Product>> GetAll() {
		var productList = this.productDao.findAll();
		return new SuccessDataResult<>(productList, "data is ordered");
	}

	@Override
	public Result add(Product product) {

		this.productDao.save(product);
		return new SuccessResult<>("Product successfully Added");
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		 var data= this.productDao.getByProductName(productName);
		if(data!=null) return  new SuccessDataResult<>(data,"Data Filtered");
		else  return  new ErrorDataResult<>(null,"Data Not found");
	}

	@Override
	public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
		return null;
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId) {
		return null;
	}

	@Override
	public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
		return null;
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return null;
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return null;
	}

	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		return null;
	}

}
