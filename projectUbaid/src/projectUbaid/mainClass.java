package projectUbaid;

import java.util.Scanner;
public class mainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Queue obj = new Queue();
		Queue finish = new Queue();
		int choice;
		
		while (true) {
			System.out.println("Enter 1 to Add complaint :");
			System.out.println("Enter 2 to Move complaint :");
			System.out.println("Enter 3 for Check Peek :");
			System.out.println("Enter 4 for to check Complaint to that are Working :");
			System.out.println("Enter 5 for to remove Complaint to that are Finished :");
			System.out.println("Enter 6 for to remove Complaint to that are next :");
			
			System.out.println("Enter 7 to exit :");
			choice=s.nextInt();
			
			if(choice == 1) {
				complaint d=new complaint();
				System.out.println("Enter Name :");
				d.name =s.next();
				System.out.println("Enter type :");
				d.type =s.next();
				System.out.println("Enter address :");
				d.address =s.next();
				obj.enQueue(d);
			}
			else if(choice == 2) {
				complaint d;
				d = obj.deQueue();
				finish.enQueue(d);
				if(d==null) {
					System.out.println("No data");
				}else {
					
					System.out.println("Name = "+d.name);
					System.out.println("Discipline = "+d.type);
					System.out.println("Passing Year = "+d.address);
				}
				
			}
			else if(choice == 3) {
				complaint d;
				d = obj.peek();
				if(d==null) {
					System.out.println("No data");
				}else {
					System.out.println("Name = "+d.name);
					System.out.println("Discipline = "+d.type);
					System.out.println("Passing Year = "+d.address);
				}
			}
			else if(choice == 4) {
				finish.display();
			}
			
			else if(choice ==5) {
				complaint d;
				d = finish.deQueue();
				if(d==null) {
					System.out.println("No data");
				}else {
					
					System.out.println("Name = "+d.name);
					System.out.println("Discipline = "+d.type);
					System.out.println("Passing Year = "+d.address);
				}
			}
			else if(choice ==6) {
				complaint d;
				d = finish.peek();
				if(d==null) {
					System.out.println("No data");
				}else {
					System.out.println("Name = "+d.name);
					System.out.println("Discipline = "+d.type);
					System.out.println("Passing Year = "+d.address);
				}
			}
			
			else if(choice == 7) {
				break;
			}
			
			
			
			
		}

	}

}

