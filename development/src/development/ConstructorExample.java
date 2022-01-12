package development;

public class ConstructorExample {
int number1;
int number2;
ConstructorExample(int number1){
	this.number1=number1;
}
public ConstructorExample(int number1, int number2) {
	this(number1);
	this.number2=number2;
}
public static void main(String[] args) {
	ConstructorExample c = new ConstructorExample(1);
	ConstructorExample c1 = new ConstructorExample(2,4);
	System.out.println(c.number1);//1
	System.out.println(c1.number1);
}

}


