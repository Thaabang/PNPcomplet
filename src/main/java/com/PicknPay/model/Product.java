/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PicknPay.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "product")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByProductID", query = "SELECT p FROM Product p WHERE p.productID = :productID")
    , @NamedQuery(name = "Product.findByName", query = "SELECT p FROM Product p WHERE p.name = :name")
    , @NamedQuery(name = "Product.findByCategory", query = "SELECT p FROM Product p WHERE p.category = :category")
    , @NamedQuery(name = "Product.findByPrice", query = "SELECT p FROM Product p WHERE p.price = :price")})
public class Product implements Serializable {
//universal version identifier for a Serializable class
    private static final long serialVersionUID = 1L;
    //indicating the member field below is the primary key of current entity.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productID")
    private Integer productID;
    @Column(name = "name")
    private String name;
    @Column(name = "category")
    private String category;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "price")
    private double price;
    @Column(name = "image")
    private String image;
    @Column(name = "totalq") 
    private Integer totalq;
    @Column(name = "trashq") 
    private Integer trashq;
    
    public Product() {
    }

    public Product(Integer productID) {
        this.productID = productID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

     public Integer getQuantity() {
        return quantity;
    }
      public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

     
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public Integer getTotalq(){
        return totalq;
    }
    
    public void setTotalq(Integer totalq){
        
        this.totalq = totalq;
        
    }
    public Integer getTrashq() {
        return trashq;
    }

    public void setTrashq(Integer trashq) {
    	
        this.trashq = trashq;
    }
    
}
