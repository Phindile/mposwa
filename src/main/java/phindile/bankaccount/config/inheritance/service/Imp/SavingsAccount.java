/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankaccount.config.inheritance.service.Imp;
import phindile.bankaccount.config.inheritance.service.Account;

/**
 *
 * @author chrisy
 */
public class SavingsAccount extends Account{
     private float Interest =10;
     
   

      public SavingsAccount(String Cname, String AccountB,float Interest, float Balance)
        {
            super(Cname,AccountB,Balance);
            
            this.Interest = Interest;
        }
        public SavingsAccount()
     {
         
     }

      public float getInterestAmount()
       {
           return this.Interest;
       }
      public float  newBalanceInterest()
      {
         Balance = (getBalance() + (getBalance()  * Interest / 100) );
          return this.Balance;
      }
          
     public String toString()
     {
         return String.format("Th Holder is\n"+super.getCustomerName()+super.getAccountNmuber()+super.getBalance()+getInterestAmount()+newBalanceInterest());
     }
     
}
