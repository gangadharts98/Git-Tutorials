package com.challenges;

public class Challenge4 {
	
	public static boolean isCatPlaying(boolean summer,int temperature)
	{
		if((summer && temperature >=25 && temperature <=45 ) ||(temperature >=25 && temperature <=35) )
		{
			return true;
		}
	
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isCatPlaying(true,40));
		System.out.println(isCatPlaying(false,45));
		System.out.println(isCatPlaying(true,50));
		System.out.println(isCatPlaying(false,25));
		System.out.println(isCatPlaying(false,20));
	}

}
