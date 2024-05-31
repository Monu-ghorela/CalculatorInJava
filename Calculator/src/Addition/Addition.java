package Addition;

import java.util.Scanner;

public class Addition {
	
	
	
	
	
    public static int add()
    
    
	{
		
    	Scanner scanner= new Scanner(System.in);
    	System.out.println("Enter two no. to add");
    	int a=scanner.nextInt();
    	int b=scanner.nextInt();
		
		return a+b;
	}
	public static void main(String[] args) {
		
		
		System.out.println(add());
		
		
		
	}

}
