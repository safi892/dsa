package may21;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int choice;
		BST b= new BST();
		while(true) {
			System.out.println("Press 1 for Add Data :");
			System.out.println("Press 2 to Search Value by name:");
			System.out.println("Press 3 for Display");
			System.out.println("Press 4 for Display Minimum");
			System.out.println("Press 5 for Display Maximum");
			System.out.println("Press 6 for Exit");
			choice=s.nextInt();
			if(choice==1) {
				Employee e = new Employee();
				System.out.println("Enter ID");
				e.id =s.nextInt();
				System.out.println("Enter Name ");
				e.name =s.next();
				System.out.println("Enter Age ");
				int a =s.nextInt();
				e.age=a+10;
				b.insert(e);
			}
			else if(choice == 2) {
				System.out.println("Enter Name to Search ");
				String d=s.next();
				b.search(d);
			}
			else if(choice == 3) {
				b.display();
			}
			else if(choice == 4) {
				System.out.println("Enter id to Search ");
				int d=s.nextInt();
				b.search2(d);
				//b.minimum();
			}
			else if(choice == 5) {
				
				b.maximum();
			}
			else if(choice == 6) {
				break;
			}
			
		}//loop

	}

}


