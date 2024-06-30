package task2may;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		Queue q= new Queue();
		int choice;
		while(true) {
			System.out.println("Enter 1 to Add Data :");
			System.out.println("Enter 2 to Remove High Priority :");
			System.out.println("Enter 3 to Display :");
			System.out.println("Enter 4 to exit:");
			choice=s.nextInt();
			if (choice == 1) {
				Team t = new Team();
				System.out.println("Enter Document :");
				t.document=s.next();
				System.out.println("Enter Designation :");
				t.designation=s.next();
				if(t.designation.equalsIgnoreCase("ProjectManager")) {
					t.priority=0;
					}
				else if(t.designation.equalsIgnoreCase("TeamLeader")) {
					t.priority=1;
				}
				else if(t.designation.equalsIgnoreCase("seniordeveloper")) {
					
					t.priority=2;
				}
				else if(t.designation.equalsIgnoreCase("juniordeveloper")) {
					
					t.priority=3;
				}
				
				q.enQueue(t);
				
			}
			else if(choice == 2) {
				Team t = q.deQueue();
				System.out.println("Document is :"+t.document);
				System.out.println("Designayion is :"+t.designation);
			}
			else if(choice == 3) {
				q.display();
			}
			else if (choice == 4) {
				break;
			}
		}//loop
		

	}

}
