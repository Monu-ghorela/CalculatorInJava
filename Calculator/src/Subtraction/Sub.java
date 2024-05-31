package Subtraction;

import java.util.Scanner;

public class Sub {

	
	public   int  sub() {
		Scanner scanner= new Scanner(System.in);
    	System.out.println("Enter two no. to Subtract");
    	int a=scanner.nextInt();
    	int b=scanner.nextInt();
		return a-b;
		
	}
	
	 
	public static void main(String[] args) {
		
		
		Sub sub=new Sub();
		// TODO Auto-generated method stub
System.out.println(sub.sub());
	}

}
