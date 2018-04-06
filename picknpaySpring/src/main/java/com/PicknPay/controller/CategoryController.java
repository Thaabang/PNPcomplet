/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PicknPay.controller;

import com.PicknPay.exceptions.DataNotFoundException;
import com.PicknPay.model.Category;
import com.PicknPay.services.CategoryService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
//adds the @Controller and @ResponseBody annotations
@RestController
//map web requests onto specific handler classes or handler methods.
@RequestMapping(value = "/category")
public class CategoryController{
     //Marks a constructor, method or config method as to be autowired by Spring's dependency injection facilities. 
    @Autowired
    private CategoryService categoryService;
    
    //========================Find All Categories======================
    @RequestMapping(value = "/findAllCategories", method = RequestMethod.GET)
    //used to bind the HTTP request/response body with a domain object in method parameter or return type
    @ResponseBody
    public Object getAllRep()
    {
        Object object = categoryService.findAllCategories();
        if(object == null)
        {
            throw new DataNotFoundException("Category Not Deleted...");
        }
       return object; 
    }
  
    //========================Save Categories======================
    @RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
    @ResponseBody
    public Category saveCategory(@RequestBody Category category) throws SQLException
    {
        Category category1 = categoryService.saveCategory(category);
        
        if(category1 == null)
        {
            throw new DataNotFoundException("Category Not Saved...");
        }
        return category1;         
    }
   
    //========================Delete Categories based on category Id======================
    @RequestMapping(value = "/deleteCategory/{name}", method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteCategory(@PathVariable String name)
    {
        int deleteRow = categoryService.deleteCategory(name);
        
        if(deleteRow != 1)
        {
            throw new DataNotFoundException("Category Not Deleted...");
        }
        
        return deleteRow;         
    }
    
}
