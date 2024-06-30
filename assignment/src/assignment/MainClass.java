package assignment;
import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		linkedList l=new linkedList();
		int choice;	
		int forId=1001;
		while(true) {
			System.out.println("Press 1 for Add Task at Start :");
			System.out.println("Press 2 to Add Task at End :");
			System.out.println("Press 3 to Search by ID:");
			System.out.println("Press 4 to Delete by ID :");
			System.out.println("Press 5 to Update Task :");
			System.out.println("Press 6 to Display All Task :");
			System.out.println("Press 7 for Exit !");
			choice=s.nextInt();
			if(choice==1) {
				Task t=new Task();
				t.id="Arid-"+forId;
				forId++;
				System.out.println("Enter Description :");
				t.description=s.next();
				System.out.println("Enter date :");
				t.date=s.next();
				System.out.println("Enter Task priority :");
				t.priority=s.next();
				System.out.println("Enter Tsk Status PENDING or PROGRESS or COMPLETED:");
				t.status=s.next();
				l.insertAtStart(t);
				
			}
			else if(choice==2) {
				Task t=new Task();
				t.id="Arid-"+forId;
				forId++;
				System.out.println("Enter Description :");
				t.description=s.next();
				System.out.println("Enter date :");
				t.date=s.next();
				System.out.println("Enter Task priority :");
				t.priority=s.next();
				System.out.println("Enter Tsk Status:");
				t.status=s.next();
				l.inserAtLast(t);
			}
			else if(choice==3) {
			
				System.out.println("Enter ID  for Search:");
				String id=s.next();
				l.search(id);
				
			}
			else if(choice==4) {
				System.out.println("Enter ID  for Delete:");
				String id=s.next();
				l.delete(id);
			}
			else if(choice==5) {
				System.out.println("Enter ID  of task you want to change Status:");
				String id=s.next();
				System.out.println("Enter Status  to Update ie PENDING or PROGRESS or COMPLETED:");
				String status=s.next();
				l.update(id, status);
			}
			else if(choice == 6) {
				l.display();
			}
			
			else if(choice == 7) {
				break;
			}
			
			
		}//loop
	}

}
