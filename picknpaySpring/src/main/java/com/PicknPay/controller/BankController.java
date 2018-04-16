/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PicknPay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.PicknPay.exceptions.DataNotFoundException;
import com.PicknPay.model.Bank;
import com.PicknPay.services.BankService;

/**
 *
 * @author User
 */
@Controller
@RequestMapping(value = "/bank")
public class BankController{
    
    @Autowired
    private BankService bankService;
    
  //######################## find bank account details  #####################################
    @RequestMapping(value = "/findBankAccount/{cardNo}/{cardHolder}/{bankName}", method = RequestMethod.GET)
    @ResponseBody
    public Bank findBankAccount(@PathVariable int cardNo, @PathVariable String cardHolder, @PathVariable String bankName)
    {
        Bank bank = bankService.findBankAccount(cardNo, cardHolder, bankName);
        
        if(bank == null)
        {
            throw new DataNotFoundException("Account Not Authorized..Verify your Credict Card Details...");
        }
        return bank;
    }
    
    
     
   //######################## Update Bank balance after deduction#####################################
    @RequestMapping(value = "/updateBankBalance/{cardNo}/{balance}", method = RequestMethod.PUT)
    @ResponseBody
    public int updateBankBalance(@PathVariable int cardNo, @PathVariable double balance)
    {
        
         int update = bankService.updateBankBalance(cardNo, balance);
         
         if(update == 0)
         {
            throw new DataNotFoundException("Bank Balance Not updated...");
         }
            
        return update;
    }
    
}
