/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PicknPay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.PicknPay.exceptions.DataNotFoundException;
import com.PicknPay.services.ProvinceService;

/**
 *
 * @author User
 */
@Controller
@RequestMapping(value = "/province")
public class ProvinceController {
    
    @Autowired
    private ProvinceService provinceService;
    
    //"""""""""""""""""""""""""""""""""View Provinces""""""""""""""""""""""""""""""
    @RequestMapping(value="/findAllProvinces", method = RequestMethod.GET)
    @ResponseBody
    public Object findAllProvinces()
    {
        Object object =  provinceService.findAllProvinces();
        
        if(object == null)
        {
            throw new DataNotFoundException("Provinces Not Found...");
        }
         return object;   
    }
}
