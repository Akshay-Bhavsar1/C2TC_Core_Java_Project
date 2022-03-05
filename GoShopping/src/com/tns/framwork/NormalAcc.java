package com.tns.framwork;

public class NormalAcc extends ShopAcc
{
	protected static float deliveryCharges= 50;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
		
	public float getDeliveryCharges() 
	{
		return deliveryCharges;
	}



	@Override
	public void bookProduct(float c) 
	{
		super.bookProduct(c);
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getDeliveryCharges()=" + getDeliveryCharges()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
		
}
