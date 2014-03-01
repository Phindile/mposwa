/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankaccount.config.inheritance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import phindile.bankaccount.config.inheritance.service.Account;
import phindile.bankaccount.config.inheritance.service.Imp.SavingsAccount;

/**
 *
 * @author chrisy
 */
@Configuration
public class Appconfig {
@Bean (name="Test")
    public Account getService()
    {
        return new SavingsAccount();
    }
}