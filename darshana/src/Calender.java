import java.util.*;
public class Calender {
	public static int getMethod(int month, int year) {
		int daysInMonth;
		if(month==4||month==6||month==9||month==11)
			daysInMonth=30;
		else{
			if (month==2){
				if (year%4==0) {
					daysInMonth=29;
				} else {
					daysInMonth=28;
				}
			}
			else
				daysInMonth=31;
		}
	return daysInMonth;		
	} 
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
			System.out.println("Enter Month");
			int a=sc.nextInt();
			System.out.println("Enter Year");
			int b=sc.nextInt();
			System.out.println(getMethod(a, b));
			
			if ((b%4==0)&&(b%100!=0)||(b%400==0))
			System.out.println("It's A Leap Year");
			else 
			System.out.println("It's Not A Leap Year");
			sc.close();
}	
}

