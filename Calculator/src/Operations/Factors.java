package Operations;

import java.util.Scanner;

public class Factors {

	
	public static void factors() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a no to find out the factors of that no");
		int a=scanner.nextInt();		
		
		for (int i = 1; i <=a; i++) {
			if (a%i==0) {
				System.out.println(i);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factors();
		
		
		
		

	}

}
