package Operations;

import java.util.Scanner;

public class Count {

	
	public static int  count() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a no to find out the count  of the digit of the  no");
		int a=scanner.nextInt();		
		
		if (a==0) {
			return 1;
		}
		int count=0;
		
		while (a>0) {
			count++;
			a/=10;
			
			
		}
		return count;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Count c=new Count();
		System.out.println(c.count());
		
	}

}
