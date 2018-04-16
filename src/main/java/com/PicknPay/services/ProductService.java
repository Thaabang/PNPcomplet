/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PicknPay.services;

import com.PicknPay.model.Product;
import com.PicknPay.repositories.ProductRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
//annotation is used to annotate classes that perform service tasks
@Service
public class ProductService{
    //Marks a constructor, method or config method as to be autowired by Spring's dependency injection facilities.
    @Autowired
    private ProductRepository productRepository;
    
    
    public Object findAllProduct()
    {
        return productRepository.findAll();
    }
    
    public Product saveProduct(Product product)
    {
        return productRepository.save(product);
    }
    
    public int deleteProduct(int productId)
    {
        return productRepository.deleteProduct(productId);
    }
    
    public ArrayList<Product> findProductByCategory(String category)
    {
        return productRepository.findProductByCategory(category);
    }
    
    public Product findProductByProductId(int productId)
    {
        return productRepository.findOne(productId);
    }
      public int updateQuantity(int productId, int quantity)
    {
        return productRepository.updateQuantity(productId, quantity);
    }
      
      public int updateTotalq(int productId, int totalq)
      {
          return productRepository.updateTotalq(productId, totalq);
      }

      public int updateProdQuantity(int quantity)
      {
          return productRepository.updateOrderQuantity(quantity);
      }
      
   public ArrayList<Product> findAllOrde() {
     return productRepository.findAllOrd();
    }
    
}
