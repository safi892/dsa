package priorityqueue;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		Priority obj = new Priority();
		int choice;
		while(true) {
			System.out.println("Enter 1 to Add Patient :");
			System.out.println("Enter 2 to Remove High Priority :");
			System.out.println("Enter 3 to Display :");
			System.out.println("Enter 4 to exit:");
			choice=s.nextInt();
			
			if(choice==1) {
				Patient p= new Patient();
				System.out.println("Enter ID :");
				p.id=s.nextInt();
				System.out.println("Enter Name :");
				p.name=s.next();
				System.out.println("Enter Priority :");
				p.priority=s.nextInt();
				obj.enQueue(p);
			}
			else if(choice == 2) {
				Patient p =obj.deQueue();
				System.out.println("Name is :"+p.name);
				System.out.println("ID is :"+p.id);
				System.out.println("Priority is :"+p.priority);
			}
			else if(choice == 3) {
				obj.display();
			}
			else if(choice == 4) {
				break;
			}
		}
	}

}
