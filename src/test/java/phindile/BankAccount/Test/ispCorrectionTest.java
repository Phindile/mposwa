/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.BankAccount.Test;

import org.testng.annotations.Test;
import phindile.bankaccount.config.ISP.complience.IspCorrection;

/**
 *
 * @author chrisy
 */
public class ispCorrectionTest {
    
    IspCorrection correct ;
    

    @Test
    
    public void setNanme()
    {
        correct.setname("Pizzy F F");
    }
    
    @Test
    public void retrieveCustomerName()
    {
        correct.getCustomerName();
    }
    
}
