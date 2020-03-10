package JavaPrograms;

public class AdvanceCalculator
{

	public static void main(String[] args) 
	{
		Calculator obj2= new Calculator();
		obj2.sub();
		obj2.sum();
		//obj2.sum1();
		System.out.println("variable " + obj2.x);
		System.out.println("variable " + obj2.y);
		System.out.println("static variable " + Calculator.a);
		System.out.println("ststic variable " + Calculator.b);
		

	}

}
