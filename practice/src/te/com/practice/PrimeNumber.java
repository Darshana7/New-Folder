package te.com.practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int x=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				x++;
			}
		}
		if (x>2) {
			System.out.println(n+ " is not a prime number");
		}
		else {
			System.out.println(n+ " is a prime number");
		}
		sc.close();
		
	}

}
