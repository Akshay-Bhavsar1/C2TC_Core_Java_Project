package com.tns.client;

import java.util.Scanner;

import com.tns.application.*;
import com.tns.framwork.*;

public class Main 
{
	public static void main(String[] args) 
	{
		final float deliveryCharges= 50;
		float item;
		boolean isPrime = false, flage = false;
		
		System.out.print("Enter Acc No:\t");
		Scanner in = new Scanner(System.in);
		int AccNo = in.nextInt();
		System.out.print("Enter Acc Name:\t");
		String AccNm = in.next();
		
		loop1:while(true)
		{
			System.out.print("Enter no of items you want:\t");
			item= in.nextInt();
			
			//customer type logic
			//customer type getting from user
			if(!flage)
			{
				loop2:while(true)
				{
					System.out.print("Enter User Type(isPrime= p or Not= n):\t");
					String answer = in.next().toLowerCase();
					
					if (answer.equals("p")) 
					{
						isPrime = true;
					    System.out.println("\n\n\n\tPrime user");
					    break loop2;
					}
					else if (answer.equals("n")) 
					{
						System.out.println("\n\n\n\tNormal User");
						isPrime = false;
						break loop2;
					} else 
					{ 
						System.out.println("\nSorry, I didn't catch that. Please answer (p/n)\n");
						continue loop2;
					}		   
				}
			}	
				
			//System.out.println("Out side of while() Loop");
				
				//step 1
				ShopFactory gsf = new GSShopFactory();
				
				if(isPrime)
				{
			
					//System.out.println("In GSPrimeAcc");

					//step 1
					gsf.getNewPrimeAcc(AccNo, AccNm, 1000, isPrime);

					
					
					//step 2
					//GSPrimeAcc Constructor Calling & Object Creation
					GSPrimeAcc gsp = new GSPrimeAcc();
		
					System.out.println("Acc no\t\t: "+gsp.getAccNo());
					System.out.println("Acc Name\t: "+gsp.getAccNm());
			
					//step 4
					//Calling bookProduct()
					gsp.bookProduct(item);
			
					System.out.println("Charges\t\t: "+gsp.getCharges());
					System.out.println("isPrime\t\t: "+gsp.isPrime());
					System.out.println("Delivery Charges: "+gsp.getDeliverycharges());
				
					//step 5
					//Calling toString()
					gsp.toString();
			
				}
				else
					if(!isPrime) // Calling GSNormalAcc
					{
						//System.out.println("\n\n\n\tGSNormalAcc\n");
						
						//step 1
						gsf.getNewNormalAcc(AccNo, AccNm, 1000, deliveryCharges);
			
						//step 3
						//GSNormalAcc Constructor Calling & Object Creation
						GSNormalAcc gsn = new GSNormalAcc();
		
						System.out.println("Acc no\t\t: "+gsn.getAccNo());
						System.out.println("Acc Name\t: "+gsn.getAccNm());
					
						//step 4
						//Calling bookProduct()
						gsn.bookProduct(item);
				
						System.out.println("Charges\t\t: "+gsn.getCharges());
						System.out.println("Delivery Charges: "+gsn.getDeliveryCharges());
						
						//step 5
						//Calling toString()
						gsn.toString();
			
					}	
					
				
				//Logged out logic
				loop3:while(true)
				{	
					System.out.print("\n\nYou Want to Log out(y/n):\t");
					String answer1 = in.next().toLowerCase();
				
					if (answer1.equals("y")) 
					{
						System.out.println("\nLogged Out Successfully");
						System.exit(0);
				 	}
					else if (answer1.equals("n")) 
					{
						flage = true;
						continue loop1;
					} else 
					{ 
						System.out.println("Sorry, I didn't catch that. Please answer y/n");
						continue loop3;
					}		
				}
		}
	}
}
