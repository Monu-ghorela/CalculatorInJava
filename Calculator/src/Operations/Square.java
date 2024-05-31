package Operations;

import java.util.Scanner;

public class Square {
	public static int Squ() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a no to find Sqaure ");
		int a=scanner.nextInt();
		return a*a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Squ());

	}

}
