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
import com.PicknPay.services.BankNamesService;

/**
 *
 * @author User
 */
@Controller
@RequestMapping(value = "/bankNames")
public class BankNamesController {
    
    @Autowired
    private BankNamesService bankNameService;
    
    
    //==================find bank names=================
    @RequestMapping(value = "/findAllBankNames", method = RequestMethod.GET)
    @ResponseBody
    public Object findAllBankNames()
    {
        Object object = bankNameService.findAllBankNames();
        if(object == null)
        {
            throw new DataNotFoundException("Bank Names Not Found...");
        }
        return object;
    }
}
