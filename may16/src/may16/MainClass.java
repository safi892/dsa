package may16;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int choice;
		BST b= new BST();
		while(true) {
			System.out.println("Press 1 for Add Data :");
			System.out.println("Press 2 to Display Value:");
			System.out.println("Press 3 to Display Ascending Value :");
			System.out.println("Press 4 to  Display Descending Value :");
			System.out.println("Press 5 for Exit !");
			choice=s.nextInt();
			if(choice==1) {
				System.out.println("Enter Data to insert ");
				int d=s.nextInt();
				b.insert(d);
			}
			else if(choice == 2) {
				
				b.display();
			}
			else if(choice == 3) {
				b.ascending();
			}
			else if(choice == 4) {
				b.descending();
			}
			
			else if(choice == 5) {
				break;
			}
		}//loop

	}

}
