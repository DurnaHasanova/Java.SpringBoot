package com.SpringBoot.Northwind.Business.Concretes;

import java.util.List;

import com.SpringBoot.Northwind.Core.Utilities.Results.DataResult;
import com.SpringBoot.Northwind.Core.Utilities.Results.Result;
import com.SpringBoot.Northwind.Core.Utilities.Results.SuccessDataResult;
import com.SpringBoot.Northwind.Core.Utilities.Results.SuccessResult;
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

}
