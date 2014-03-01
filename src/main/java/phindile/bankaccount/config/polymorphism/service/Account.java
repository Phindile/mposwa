/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankaccount.config.polymorphism.service;

/**
 *
 * @author chrisy
 */
public class Account {
    
    private String customerName;
    
    
    public Account(String customername)
    {
        this.customerName = customername;
    }
    
    public String toString()
    {
        return "The Name of the AccountHlder is\""+customerName+"\"";
    }
    
}
