/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankaccount.config.LSP.compliance.service;

/**
 *
 * @author chrisy
 */
public class lspCorrection {
       protected int balance;
    protected int period;
    
    public lspCorrection()
    {
        
    }
    
    public lspCorrection(int balance,int period)
    {
        this.balance = balance;
        this.balance = balance;
    }
    
    //open an account with the given balance
    
    public boolean openAccount(int balance)
    {
        this.balance =balance;
        return true;
    }
    
    //close the Account
    public boolean closeAccount()
    {
//      
           return true;
    }
    //SEtters
    
    public  void setBalance(int balance)
    {
         if(balance>0)
            this.balance = balance;
            else
               System.out.println("Balance should be greater Than 0");
    }
    public void setPeriod(int period)
    {
        if(period!=0)
            System.out.println("Period should be greater than 0");
        else
             this.period = period;
    }
    //Getters
    
    public int getPeriod()
    {
        return this.period;
    }
     public int getBalance()
    {
        return this.balance;
    }
    
}
