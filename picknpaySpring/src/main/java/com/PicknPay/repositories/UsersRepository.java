/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PicknPay.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.PicknPay.model.Users;

/**
 *
 * @author User
 */
@RepositoryRestController
public interface UsersRepository extends CrudRepository<Users, Integer> {
    
    //==============================Login Based on email And password=============================================
    @Query("SELECT u FROM Users u WHERE u.email = :email")
    public Users login(@Param("email") String email);
     
   
    
}
