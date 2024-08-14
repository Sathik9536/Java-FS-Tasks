package mine;

import java.util.*;

public class Switchcase {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	// To get user input
		System.out.println("Enter the number a");
		int a = sc.nextInt();
		
		System.out.println("Enter the number b");
		int b = sc.nextInt();
		
		System.out.println("Enter the operator");
		
		int c = sc.nextInt();
		
		
		
		
		switch(c){                       // Multiple statement we use
		
		case 1:
			
			System.out.println("Result : "+(a+b));
			
			break;
		case 2 :
			
			System.out.println("Result : "+(a-b));
			
			break;
		case 3 :
			
			System.out.println("Result : "+(a*b));
			
			break;
			
		case 4 :
			
			System.out.println("Result : "+(a/b));
			
			break;
		
		default :          // It's like a else statement
			
			System.out.println("Invalid Data");
		
		
	}
		

}
}
