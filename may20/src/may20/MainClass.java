package may20;

import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int choice;
		BST b= new BST();
		while(true) {
			System.out.println("Press 1 for Add Data :");
			System.out.println("Press 2 to Search Value:");
			System.out.println("Press 3 to Display Minimum Value :");
			System.out.println("Press 4 to  Display Maximum Value :");
			System.out.println("Press 5 for Sum !");
			System.out.println("Press 6 for Average !");
			System.out.println("Press 7 for Count !");
			System.out.println("Press 8 for Delete !");
			System.out.println("Press 9 for Exit !");
			choice=s.nextInt();
			if(choice==1) {
				System.out.println("Enter Data to insert ");
				int d=s.nextInt();
				b.insert(d);
			}
			else if(choice == 2) {
				System.out.println("Enter Data to Search ");
				int d=s.nextInt();
				b.search(d);
			}
			else if(choice == 3) {
				b.minimum();
			}
			else if(choice == 4) {
				b.maximum();
			}
			
			else if(choice == 5) {
				System.out.println("Sum is : "+b.sum());
			}
			else if(choice == 6) {
				b.average();
			}
			else if(choice == 7) {
				System.out.println("Count is : "+b.Count());
			}
			else if(choice == 8) {
				System.out.println("Enter Data to Search ");
				int d=s.nextInt();
				b.search(d);
			}
			
		}//loop

	}

}

