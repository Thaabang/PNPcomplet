/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PicknPay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.PicknPay.model.Users;
import com.PicknPay.repositories.UsersRepository;

/**
 *
 * @author User
 */
@Service
public class UsersService {
    
    @Autowired
    private UsersRepository usersRepository;
    
    public Users saveUser(Users users)
    {
      PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); 
      String hashedPassword = passwordEncoder.encode(users.getPassword());
      users.setPassword(hashedPassword);
      return usersRepository.save(users);
    }
    
    public Users findUserByUserId(int userId)
    {
        return usersRepository.findOne(userId);
    }
    
    public void deleteUser(int userId)
    {
        usersRepository.delete(userId);
    }
    
    public Users userLogin(String email)
    {
   
        return usersRepository.login(email);
    }
    
}
