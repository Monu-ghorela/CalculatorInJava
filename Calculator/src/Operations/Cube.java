package Operations;

import java.util.Scanner;

public class Cube {

	public int cube() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a no to find out the sqaure of that no");
		int a=scanner.nextInt();		
		
		return a*a*a;
		
	}
	public static void main(String[] args) {
		
		
		
		
		Cube c=new Cube();
		System.out.println(c.cube());
		// TODO Auto-generated method stub

	}

}
