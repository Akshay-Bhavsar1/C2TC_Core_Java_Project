package com.tns.framwork;

public abstract class ShopAcc 
{
	protected static int accNo;
	protected static String accNm;
	protected static float charges;
	
	public ShopAcc(int accNo, String accNm, float charges) 
	{
		this.setAccNo(accNo);
		this.setAccNm(accNm);
		this.charges = charges;
	}

	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public void bookProduct(float c)
	{
		this.charges *= c; 
		this.items(c);
	}

	public void items(float i) 
	{
		System.out.println("Items\t\t: "+i);
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
		
}
