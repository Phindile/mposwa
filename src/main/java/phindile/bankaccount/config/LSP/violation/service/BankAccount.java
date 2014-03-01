/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankaccount.config.LSP.violation.service;

/**
 *
 * @author chrisy
 */
public class BankAccount {
    
    protected int balance;
    protected int period;
    
    public BankAccount()
    {
        
    }
    
    public BankAccount(int balance,int period)
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
//       if(balance>0)
//           return true;
//       else
           return true;
    }
    //SEtters
    
    public  void setBalance(int balance)
    {
        this.balance = balance;
    }
    public void setPeriod(int period)
    {
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
