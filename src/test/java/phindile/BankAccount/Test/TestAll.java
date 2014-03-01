/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.BankAccount.Test;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import phindile.bankaccount.config.encapsulation.service.Imp.encapImp;
import phindile.bankaccount.config.encapsulation.service.encapInter;
import phindile.bankaccount.config.inheritance.config.Appconfig;
import phindile.bankaccount.config.inheritance.service.Account;
import phindile.bankaccount.config.inheritance.service.Imp.SavingsAccount;

/**
 *
 * @author chrisy
 */
public class TestAll {
    
    private Account acc;
    SavingsAccount  save = new SavingsAccount();
 
      Account ac  = new  Account ("Pindile","123456",600);
  

   
    
    @BeforeClass
    public void setUpClass() throws Exception {
            ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
        acc = (Account)ctx.getBean("Test");
       
        }
     
    @Test
   
   public void display()
   {
     
      save.toString();
   }
   
}
