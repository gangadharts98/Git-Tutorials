package com.challenges;

public class Challenge3 {
	
	public static void printEqual(int a,int b,int c) {
		if(a<0 || b<0 || c<0)
		{
			System.out.println("Invalid Value");
		}
		else if(a==b && b==c && c==a)
		{
			System.out.println("All numbers are equal");
		}
		else if(a!=b && b!=c && c!=a)
		{
			System.out.println("All numbers are different");
		}
		else 
		{
			System.out.println("Neither all are equal or different");
		}
	}

	public static void main(String[] args) {
		printEqual(2,2,2);
		printEqual(2,-1,5);
		printEqual(100,200,300);
		printEqual(10,10,20);

	}

}
