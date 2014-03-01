/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.BankAccount.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import phindile.bankaccount.config.ISP.violation.service.ispBank;
import phindile.bankaccount.config.inheritance.config.Appconfig;
import phindile.bankaccount.config.inheritance.service.Account;

/**
 *
 * @author chrisy
 */
public class ispvioTest {
    
   private ispBank isp;
   
    ispBank is = new ispBank("Pizzy","12345",500);
    
    @Test
    
    public void TestIspViolation()
    {
     
       is.getAccountNmuber();
    }
     @Test
    
    public void BalanceTestIspViolation()
    {
     
       is.getBalance();
    }
     @Test
    
    public void NameTestIspViolation()
    {
     
       is.getCustomerName();
    }
    

   
}
