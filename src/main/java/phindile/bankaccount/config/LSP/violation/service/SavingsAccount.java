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
public class SavingsAccount extends BankAccount {
    
    private int defaultperiod;
    
    
    public SavingsAccount()
    {
        
    }
    
    public SavingsAccount(int balance,int period)
    {
        super(balance,period);
    }
    
    public boolean closeAccount()
    {
        if(balance>0 && period >defaultperiod)
            return true;
        else
            return false;
    }
    
    //setters for period
    
    public void setDefaultPeriod(int defaultPeriod)
    {
        this.defaultperiod = defaultPeriod;
    }
    //getters
    
    public int getDefaultPeriod()
    {
        return this.defaultperiod;
    }
    
}
