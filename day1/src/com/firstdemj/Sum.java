package com.firstdemj;
public class Sum{
	public static void main(String[] args) {
		int n=10;
		int sum=0;
		for (int i=1;i<=n;i++) {
			if(i%3==0||i%5==0) {
			sum+=i;
		}
		}
			
		System.out.printf("Sum of number is%d\n", n,sum);
	}
}