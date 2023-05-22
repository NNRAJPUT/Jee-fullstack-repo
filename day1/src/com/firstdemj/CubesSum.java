package com.firstdemj;
import java.util.*;

public class CubesSum {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
	int number=sc.nextInt();
    int reminder, ans = 1;
	
	while(number!=0)
	{
		reminder = number%10;
	
		ans = ans*(number*number*number);
		number = number/10;
		
		
		
	}
	System.out.println(ans);
      int cube = ans+ans+ans;
      System.out.println(cube);
      
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
	int number=sc.nextInt();
	int reminder, ans = 1;
	
	while(number!=0)
	{
		reminder = number%10;
	
		ans = ans*(number*number*number);
		number = number/10;
		
		
		
	}
	System.out.println(ans);
	  int cube = ans+ans+ans;
	  System.out.println(cube);
	
	}

}
