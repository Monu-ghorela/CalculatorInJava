package Operations;

import java.util.Scanner;

//import java.util.Iterator;

public class Factorial {

	public int  fact() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a no to find out the factorial of that no");
		int a=scanner.nextInt();		
		
		
		int fact=1;
		for (int i = 1; i <=a; i++) {
			fact*=i;
			
		}
		return fact;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		Factorial f=new Factorial();
		System.out.println(f.fact());
		// TODO Auto-generated method stub

	}

}
