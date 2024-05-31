package implementation;

import java.util.Scanner;


import Multiplication.MultiPly;
import Addition.Addition;
import Division.Division;
import Subtraction.Sub;
import Operations.*;
public class ProjectCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("<---------------welcome to the calculator ------->");
		for (int i = 1; true; i++) {

			System.out.println("Please chose an otion to do the task");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. multiplication");
			System.out.println("4. division");
			System.out.println("5. Special task");
			System.out.println("6. Exit");
			int option=scanner.nextInt();
			int ans;
			if (option==1) {
				
				ans=Addition.add();
				System.out.println("The Ans of the task is "+ans);
				
			}else if (option==2) {
				
				Sub sub=new Sub();
				ans=sub.sub();
				System.out.println("The Ans of the task is "+ans);
				
				
			}
			else if(option==3) {
				
				
				
				ans=MultiPly.Multiplication();
				System.out.println();
				System.out.println("The Ans of the task is "+ans);
			}else if (option==4) {
				
				Division division=new Division();
				ans=division.Div();
				System.out.println("The Ans of the task is "+ans);
				
			}else if(option==5){
				
				System.out.println("Enter a option to select a operation to do");
				System.out.println("1.Sqaure");
				System.out.println("2.cube");
				System.out.println("3.Power");
				System.out.println("4.Count");
				System.out.println("5.Factorial");
				System.out.println("6.Factors");
				int subOption=scanner.nextInt();
				
				if (subOption==1) {
					ans=Square.Squ();
					System.out.println("The Ans of the task is "+ans);

					
				}else if (subOption==2) {
					Cube cube=new Cube();
					ans=cube.cube();
					System.out.println("The Ans of the task is "+ans);

				}else if (subOption==3) {
					ans=Power.pow();
					System.out.println("The Ans of the task is "+ans);

				}else if (subOption==4) {
					Factorial factorial=new Factorial();
					ans=factorial.fact();
					System.out.println("The Ans of the task is "+ans);

				}else if (subOption==5) {
					ans=Count.count();
					System.out.println("The Ans of the task is "+ans);

					
				}else if (subOption==6) {
					Factors.factors();
				}
				
			}else {
				System.out.println("Thanku for Using the Calcualtor. For more inforamation Conatact : ");
				System.out.println("The MD:Monu Ghorela ");
				System.out.println("Contact No:+91 6377730881");
				break;			}

		}

	}

}
