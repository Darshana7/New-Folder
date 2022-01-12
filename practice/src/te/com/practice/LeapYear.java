package te.com.practice;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year");
		int x=sc.nextInt();
		if((x%4==0)&&(x%100!=0)||(x%400==0)) {
			System.out.println("It's a leap year");
		}
		else {
			System.out.println("It's not a leap year");
		}
		sc.close();
	}
}
