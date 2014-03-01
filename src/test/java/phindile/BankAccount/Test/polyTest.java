/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.BankAccount.Test;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import phindile.bankaccount.config.polymorphism.service.Account;
import phindile.bankaccount.config.polymorphism.service.Savings;

/**
 *
 * @author chrisy
 */
public class polyTest {
    
   Account save = new Savings("Pindile","35346446",900);
   @Test
   
   public void Test()
   {
       System.out.println("You Details For You Savings Account are"+save.toString());
    
   }
}
