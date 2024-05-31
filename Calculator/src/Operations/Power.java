package Operations;

import java.util.Scanner;

public class Power {

	public static int  pow() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter base and power");
		
		int base=scanner.nextInt();
		int power=scanner.nextInt();
		int realPower=1;
		for (int i = 1; i <=power; i++) {
			realPower*=base;
		}
		
		return realPower;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow());

	}

}
