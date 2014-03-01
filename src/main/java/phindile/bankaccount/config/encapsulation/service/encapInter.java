/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankaccount.config.encapsulation.service;

/**
 *
 * @author chrisy
 */
public class encapInter {
    
        
    private String Customername ;
    private String Accountnumber;
    public float Balance;
    
   
    
    
    public encapInter (String Customername,String Accountnumber,float Balance)
    {
      this.Customername = Customername;
      this.Accountnumber =Accountnumber;
      this.Balance = Balance;
              
    }
     public encapInter()
    {
    }
    //getters
    
    //methods to return Customers Name
    public void setname(String nm)
    {
        if(nm.isEmpty())
        {
            System.out.println("The Name must be Entered please");
        }
        else{
            this.Customername =nm;
        }
    }
    public void setacc(String ac)
    {
         if(ac.length()<5)
         {
             System.out.println("The Acvount should be greater Than 5 CHARACTER");
        
         }
         else{
        this.Accountnumber =ac;
         }
    }
    
    public void setBalance(float b)
    {
         if(b <=20)
         {
             System.out.println("The Amount should Not be less Than 20 PLease");
        
         }
         else{
             this.Balance =b;
         }
    }
    
    public String getCustomerName()
    {
        return this.Customername;
        
    }
    //methods to return Customers Name
    
    public String getAccountNmuber()
    { 
        return this.Accountnumber;
        
    }
    //methods to return Customers Name
    
    public float getBalance()
    {
        return this.Balance;
        
    }
   


    public String toString()
    {
       
         //System.out.print("Account NUmber is \n"+getAccountNmuber());
        // System.out.print("Account NUmber is \n"+getBalance());

      return String.format(getCustomerName()+getAccountNmuber()+getBalance());
        
     
         
    }
    
}
