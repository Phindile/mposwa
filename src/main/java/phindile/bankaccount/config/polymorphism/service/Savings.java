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
public class Savings extends Account {
    private String Accountnumber;
    private float deposit;
    

    public Savings(String customername,String Accountnumber,float deposit) {
        super(customername);
        this.Accountnumber =Accountnumber;
        this.deposit =deposit;
    }
    
    public String toString()
    {
        return String.format(" ---Savings Account-----"+super.toString()+Accountnumber+deposit);
    }
    
    
}
