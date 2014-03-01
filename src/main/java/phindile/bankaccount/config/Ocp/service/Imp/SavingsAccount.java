/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankaccount.config.Ocp.service.Imp;

import phindile.bankaccount.config.Ocp.service.ocp;

/**
 *
 * @author chrisy
 */
public class SavingsAccount extends ocp{

	public SavingsAccount()
	{
	}

	public SavingsAccount(final String name)
	{
		super(name);
	}

		public String withdraw(final float amount)
	{
		final float current = this.getAmount();
		float withdrawal = 0;
		String result = "";
		if (current - amount >= 0)
		{
			withdrawal = amount;
			setAmount(current - withdrawal);
			result = "withdrawn " + withdrawal + "";
			result = result + " from " + getName();
			result = result + "\ncurrent balance is: " + getAmount() + "";
		}
		else
		{
			result = "Insuficient money available";
		}

		return result;
	}

	@Override
	public String toString()
	{
		return "SavingAccount";
	}

}
