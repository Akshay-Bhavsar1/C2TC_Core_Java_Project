package com.tns.application;

import com.tns.framwork.*;

public class GSPrimeAcc extends PrimeAcc
{
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}
	
	public GSPrimeAcc() {
		super(accNo, accNm, charges, isPrime);
	}

	
	
	@Override
	public void bookProduct(float c) 
	{
		super.bookProduct(c);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [charges=" + charges + ", isPrime()=" + isPrime() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

		
	
}
