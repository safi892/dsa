package may30;

import java.util.Scanner;


public class mainClass {

	public static void main(String[] argw ) {
		Scanner s = new Scanner (System.in);
		int choice;
		tree b= new tree();
		while(true) {
			System.out.println("Press 1 for Add Data :");
			System.out.println("Press 2 for Display");
			System.out.println("Press 3 for Exit");
			choice=s.nextInt();
			if(choice==1) {
				
				System.out.println("Enter Name ");
				String e =s.next();
				
				b.insert(e);
			}
			
			else if(choice == 2) {
				b.display();
			}
			
			else if(choice == 3) {
				
				break;
			}
			
			
		}//loop
	}
		
		
}
