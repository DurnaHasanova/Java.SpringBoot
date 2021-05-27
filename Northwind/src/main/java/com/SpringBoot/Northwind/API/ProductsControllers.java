package com.SpringBoot.Northwind.API;
import java.util.List;

import com.SpringBoot.Northwind.Core.Utilities.Results.DataResult;
import com.SpringBoot.Northwind.Core.Utilities.Results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.SpringBoot.Northwind.Business.Abstracts.ProductService;
import com.SpringBoot.Northwind.Entities.Concretes.Product;


@RestController
@RequestMapping("/api/products")
public class ProductsControllers {

	private final ProductService productService;
	
	@Autowired
	public ProductsControllers(ProductService productService) {
		super();
		this.productService = productService;
	}


	@GetMapping("/getAll")
	public ResponseEntity<DataResult<List<Product>>> GetAll() {

		 var list= productService.GetAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/getByName")
	public ResponseEntity<DataResult<Product>> GetByName( @RequestParam String productName) {

		var list= productService.getByProductName(productName);
		return ResponseEntity.ok(list);
	}


	@PostMapping("/add")
	public  ResponseEntity<Result> add(@RequestBody Product product){

		var result= productService.add(product);
		return ResponseEntity.ok(result);

	}
}
