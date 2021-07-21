package com.challenges;

public class challenge1
{




public static void getDurationString(int minutes, int seconds) {
	if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
		// logic here
		int hours = minutes/60;
		minutes = minutes%60;
		System.out.println(hours+"h : "+minutes+"m : "+seconds+"s");
	} else {
		System.out.println("invalid value");
	}	
}

public static void getDurationString(int seconds) {
	if(seconds >= 0) {
		//logic for seconds to minute
		int minutes = seconds/60;
		seconds = seconds%60;
		getDurationString(minutes,seconds);
		} else {
		System.out.println("invalid value");
	}
	
}

public static void main(String[] args) {
	
	getDurationString(3600);
	getDurationString(90, 55);
	getDurationString(63,6);
	getDurationString(3666);
	
}


}
