/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankaccount.config.ISP.violation.service;

/**
 *
 * @author chrisy
 */
public class ispBank {
    private String Customername ;
    private String Accountnumber;
    public float Balance;
    
   
    
    
    public ispBank(String Customername,String Accountnumber,float Balance)
    {
      this.Customername = Customername;
      this.Accountnumber =Accountnumber;
      this.Balance = Balance;
              
    }
     public ispBank()
    {
    }
    //getters
    
    //methods to return Customers Name
    public void setname(String nm)
    {
        Customername =nm;
    }
    public void setacc(String ac)
    {
        Accountnumber =ac;
    }
    
    public void setBalance(float b)
    {
        Balance =b;
    }
    
    public String getCustomerName()
    {
        return(Customername);
        
    }
    //methods to return Customers Name
    
    public String getAccountNmuber()
    {
        return(Accountnumber);
        
    }
    //methods to return Customers Name
    
    public float getBalance()
    {
        return(Balance);
        
    }
   


    public String toString()
    {
      return String.format(getCustomerName()+getAccountNmuber()+getBalance());
         
    }

    
}
