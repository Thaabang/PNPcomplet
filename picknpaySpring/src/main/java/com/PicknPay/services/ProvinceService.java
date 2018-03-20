/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PicknPay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PicknPay.repositories.ProvinceRepositiory;

/**
 *
 * @author User
 */
@Service
public class ProvinceService{
    @Autowired
    private ProvinceRepositiory provinceRepository;
    public Object findAllProvinces()
    {
        return provinceRepository.findAll();
    }
    
}
