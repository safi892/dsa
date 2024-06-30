package may28;

import java.util.Scanner;


public class mainClass {
	public static void main(String[] argw ) {
		Scanner s = new Scanner (System.in);
		int choice;
		Tree b= new Tree();
		while(true) {
			System.out.println("Press 1 for Add Data :");
			System.out.println("Press 2 to Search Value by id:");
			System.out.println("Press 3 for Ascending Display");
			System.out.println("Press 4 for Decending Display");
			System.out.println("Press 5 for Exit");
			choice=s.nextInt();
			if(choice==1) {
				book e = new book();
				System.out.println("Enter ID");
				e.id =s.nextInt();
				System.out.println("Enter Name ");
				e.name =s.next();
				System.out.println("Enter Author ");
				e.author=s.next();
				b.insert(e);
			}
			else if(choice == 2) {
				System.out.println("Enter ID to Search ");
				int d=s.nextInt();
				b.search(d);
			}
			else if(choice == 3) {
				b.displayAscending();
			}
			else if(choice == 4) {
				
				b.displayDesending();
			}
			else if(choice == 5) {
				
				break;
			}
			
			
		}//loop

		
		
		
	}

}
