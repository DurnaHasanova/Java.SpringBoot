package com.SpringBoot.Northwind.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Categories")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","products"})
public class Category {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="category_id")
    private int id;

    @Column(name="category_name")
    private  String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    //@Column(name="description")
   // private  String description;

    //@Column(name="picture")
    //private  String picture;
}
