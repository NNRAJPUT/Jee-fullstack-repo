package com.firstdemj;
import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first_number=0, second_number=1, third_number, i, count =8;
		System.out.print(first_number +" "+ second_number+" ");
				
			for(i=2;i<8;++i)
			{
				third_number = first_number + second_number;
				System.out.print(third_number+" ");
				first_number = second_number;
				second_number = third_number;
			}
				

	}

}
