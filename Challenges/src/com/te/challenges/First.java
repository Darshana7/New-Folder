package com.te.challenges;

public class First {
	static int hour;

	void getDurationString(int minutes, int seconds) {
		
		if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
			hour = minutes / 60;
			minutes = minutes % 60;
			System.out.println(hour + ":" + minutes + ":" + seconds);
		} else
			System.out.println("invalid value");
	}

	void getDurationString(int seconds) {
		if (seconds >= 0) {
			seconds = seconds / 60;
			System.out.println(seconds + " minute");
		} else
			System.out.println("invalid input");
	}

	public static void main(String[] args) {
		First f = new First();
		f.getDurationString(120, 1);
		f.getDurationString(60);
	}

}
