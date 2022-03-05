package com.tns.application;

import com.tns.framwork.*;

public class GSNormalAcc extends NormalAcc
{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		super(accNo, accNm, charges, deliveryCharges);
	}
	
	public GSNormalAcc() 
	{
		super(accNo, accNm, charges, deliveryCharges);
	}

	
		
	@Override
	public void bookProduct(float c) 
	{
		super.bookProduct(c);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [getDeliveryCharges()=" + getDeliveryCharges() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
