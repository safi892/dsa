package may15;
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
			System.out.println("Press 5 for Exit !");
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
				break;
			}
		}//loop

	}

}
