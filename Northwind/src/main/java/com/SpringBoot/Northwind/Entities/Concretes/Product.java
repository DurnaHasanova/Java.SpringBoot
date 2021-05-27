package com.SpringBoot.Northwind.Entities.Concretes;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Products")

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private Integer id;
	
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "supplier_id")
	private Integer supplierId;
	
	//@Column(name = "category_id")
	//private Integer categoryId;
	
	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "units_in_stock")
	private short unitsInStock;
	
	@Column(name = "units_on_order")
	private short unitsOnOrder;
	
	@Column(name = "reorder_level")
    private short reorderLevel;
    
	@Column(name = "discontinued")
    private Integer discontinued;


	@ManyToOne()
	@JoinColumn(name="category_id")
	private Category category;
}
