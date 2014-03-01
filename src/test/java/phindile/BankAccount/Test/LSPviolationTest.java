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
import phindile.bankaccount.config.LSP.violation.service.BankAccount;
import phindile.bankaccount.config.inheritance.service.Imp.SavingsAccount;

/**
 *
 * @author chrisy
 */
public class LSPviolationTest {
    
   BankAccount account = new BankAccount(800,2);

   
   @Test
   public void getBalance()
   {
     account.getBalance();
   }
  @Test
  public void getPeriod()
  {
      account.getPeriod();
  }
   
}
