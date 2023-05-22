package com.firstdemj;



import java.util.Scanner;

class PrimeNumbers {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		int number;
		int prime;
		Scanner s = new Scanner(System.in);
		System.out.println("enter any number");
		number=s.nextInt();
		for(int i=2;i<number;i++)
		{
			prime=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					prime=1;
				
				
			}
			if(prime==0)
				System.out.println(i);
			
		
		}

	}

}
