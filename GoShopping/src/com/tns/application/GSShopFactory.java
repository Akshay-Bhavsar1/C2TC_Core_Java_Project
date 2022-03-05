package com.tns.application;

import com.tns.framwork.NormalAcc;
import com.tns.framwork.PrimeAcc;
import com.tns.framwork.ShopFactory;

public class GSShopFactory implements ShopFactory 
{


	@Override
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsp = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return gsp;
	}

	@Override
	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc gsn = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return gsn;
	}
	
	

	
}
