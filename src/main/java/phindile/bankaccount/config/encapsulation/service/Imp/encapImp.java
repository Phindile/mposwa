/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankaccount.config.encapsulation.service.Imp;

import phindile.bankaccount.config.encapsulation.service.encapInter;

/**
 *
 * @author chrisy
 */
public class encapImp extends encapInter {
     private float Interest =10;
     
   

      public encapImp(String Cname, String AccountB,float Interest, float Balance)
        {
            super(Cname,AccountB,Balance);
            
            this.Interest = Interest;
        }
        public encapImp()
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
