package newTask;
import java.util.Scanner;
public class MainArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Array obj=new Array();
		
		int choice;
		while(true) {
			
			System.out.println("Press 1 for Add Book at Last :");
			System.out.println("Press 2 toAdd Book at Start :");
			System.out.println("Press 3 to Add Book at specific position :");
			System.out.println("Press 4 to Display all Book Record :");
			System.out.println("Press 5 to delete  Book :");
			System.out.println("Press 6 to delete last Book :");
			System.out.println("Press 7 for Exit !");
			choice=s.nextInt();
			if(choice==1) {
				Book b=new Book();
				System.out.println("Enter ID :");
				b.id=s.nextInt();
				System.out.println("Enter Title :");
				b.title=s.next();
				System.out.println("Enter Price :");
				b.price=s.nextDouble();
				System.out.println("Enter Subject :");
				b.subject=s.next();
				System.out.println("Enter Number of Copies :");
				b.noOfCopies=s.nextInt();
				obj.insertAtLast(b);
				
			}
			else if(choice==2) {
				Book b=new Book();
				System.out.println("Enter ID :");
				b.id=s.nextInt();
				System.out.println("Enter Title :");
				b.title=s.next();
				System.out.println("Enter Price :");
				b.price=s.nextDouble();
				System.out.println("Enter Subject :");
				b.subject=s.next();
				System.out.println("Enter Number of Copies :");
				b.noOfCopies=s.nextInt();
				obj.insertAtStart(b);
			}
			else if(choice==3) {
				Book b=new Book();
				System.out.println("Enter ID :");
				b.id=s.nextInt();
				System.out.println("Enter Title :");
				b.title=s.next();
				System.out.println("Enter Price :");
				b.price=s.nextDouble();
				System.out.println("Enter Subject :");
				b.subject=s.next();
				System.out.println("Enter Number of Copies :");
				b.noOfCopies=s.nextInt();
				System.out.println("Enter Position :");
				int p=s.nextInt();
				obj.insertAtSpecific(b, p);
				
			}
			else if(choice==4) {
				obj.display();
			}
			else if(choice==5) {
				System.out.println("Enter ID :");
				int i=s.nextInt();
				obj.delete(i);
			}
			
			
		}//loop
	}

}
