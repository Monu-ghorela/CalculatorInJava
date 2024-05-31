package Multiplication;

import java.util.Scanner;

public class MultiPly {
	
	
	
	public  static int  Multiplication() {
		Scanner scanner= new Scanner(System.in);
    	System.out.println("Enter two no. to Multiply");
    	int a=scanner.nextInt();
    	int b=scanner.nextInt();
		return a*b;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Multiplication());

	}

}
