package te.com.practice;

public class ArraySmallest {
	
	public static void main(String[] args) {
		
		int []a={66,-65,33,-211,1,45};
		int smallest=a[0];
		for (int i = 0; i < a.length; i++) {
			if(smallest>a[i]) {
				smallest=a[i];
			}
		}
		System.out.println("Smallest: "+smallest);
}
}
	
