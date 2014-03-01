/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankaccount.config.Ocp.service;

/**
 *
 * @author chrisy
 */
public abstract class ocp
{
	private float amount = 0;
	private String name;

	public ocp()
	{
	}

	public ocp(final String name)
	{
		this.name = name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setAmount(final float amount)
	{
		this.amount = amount;
	}

	public float getAmount()
	{
		return amount;
	}

	public String deposit(final float amount)
	{
		final float current = getAmount();
		setAmount(current + amount);

		String result = "deposited " + amount + "";
		result = result + " for " + getName();
		result = result + "\ncurrent balance is: " + getAmount() + "";
		return result;
	}

	public abstract String withdraw(float amount);

			///////////

    
}
