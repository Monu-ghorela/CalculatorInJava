package Division;

import java.util.Scanner;

public class Division {
	int num;
	{
		num = 10;
		System.out.println(num);

	}

	Division(int num) {
		System.out.println(num);
		num = num;
		System.out.println(num);

	}

	{

	}

	public final int Div() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two no. to Divide");
		throw new NullPointerException();
//    	int a=scanner.nextInt();
//    	int b=scanner.nextInt();
//		return a/b;

	}

	public final static void main(String[] args) throws Exception {
		Division division = new Division(5);

		System.out.println(division.num);
		// TODO Auto-generated method stub

	}

}
