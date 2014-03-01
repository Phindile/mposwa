/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankaccount.config.ISP.complience;

/**
 *
 * @author chrisy
 */
public class IspCorrection {
    
    private String Customername ;
   
   
    
    
    public IspCorrection(String Customername)
    {
      this.Customername = Customername;
     
              
    }
   
    //methods to return Customers Name
    public void setname(String nm)
    {
        Customername =nm;
    }
    
     //methods to return Customers Name
    public String getCustomerName()
    {
        return(Customername);
        
    }
   
    
    
}
