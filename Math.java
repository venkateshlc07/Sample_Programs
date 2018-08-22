/* Arithmatic Operations */

import java.util.*;


class Operation
{
	public static int add(int a,int b)
	{

		return(a+b);
	}

	public static int sub(int a,int b)
	{
		return(a-b);
	}

	public static int mul(int a,int b)
	{

		return(a*b);
	
	}

	public static int div(int numerator ,int denominator)
	{
		

		return(numerator/denominator);
	
	}




}
class Math{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter two numbers");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	System.out.println("Addition = "+Operation.add(num1,num2));
	System.out.println("Subtraction = "+Operation.sub(num1,num2));
	System.out.println("Multiplication = "+Operation.mul(num1,num2));
	System.out.println("Division = "+Operation.sub(num1,num2));
	
	}
}