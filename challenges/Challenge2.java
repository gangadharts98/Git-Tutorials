package com.challenges;


public class Challenge2 {
	
	public static double area(double radius)
	{
		if(radius<0)
			return -1.0;
		else
			return Math.PI *radius*radius;
	}
	
	public static double area(double x,double y)
	{
	if(x<0 || y<0)
		return -1.0;
	else
		return x*y;
		
	}
	public static void main(String[] args) {
		System.out.println(area(13));
		System.out.println(area(-6));
		System.out.println(area(3.0,8.0));
		System.out.println(area(-2.0,20));
		System.out.println(area(-25.0,-50));

	}

}
