import java.util.Scanner;


public class calculator {

	void add()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\n enter 2 numbers for addition");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a+ b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
		
	}
	 
	void sub()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\n enter 2 numbers for substraction");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a-b;
		System.out.println("substraction of "+a+" and "+b+" is "+c);
			
		
	}
	
	void multiply()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\n enter 2 numbers for multilplication");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a* b;
		System.out.println("multiplication of "+a+" and "+b+" is "+c);
		
	}
	
	void divide()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\n enter 2 numbers for division");
		int a = s.nextInt();
		int b = s.nextInt();
		float c = a/b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator c = new calculator();
		
		System.out.println("Welcome to Calculator Application:");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3, multiplication");
		System.out.println("4. Division");
		System.out.println("please enter your choice: ");
		Scanner s1= new Scanner(System.in);
		int choice = s1.nextInt();
		
		switch(choice)
			{
		case 1:
			c.add();
			break;
			
		case 2:
			c.sub();
			break;
			
		case 3:
			c.multiply();
			break;
			
		case 4:
			c.divide();
			break;
		default:
			System.out.println("Alert: you have provided wrong input! \n  please try again...");
			
			}
		 	}

}
