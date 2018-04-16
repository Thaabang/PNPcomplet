/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PicknPay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PicknPay.repositories.BankNamesRepository;

/**
 *
 * @author User
 */
@Service
public class BankNamesService{
    @Autowired
    private BankNamesRepository bankNameRepository;
    
    public Object findAllBankNames()
    {
        return bankNameRepository.findAll();
    }
}
