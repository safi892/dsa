package circulrQueue;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		CircularQueue q =new CircularQueue();
		int chice;
		
		while(true) {
			System.out.println("Enter 1 to add Data in Queue");
			System.out.println("Enter 2 to delete Data in Queue");
			System.out.println("Enter 3 to check peek data in Queue");
			System.out.println("Enter 4 to Display Queue");
			System.out.println("Enter 5 to Exit");
			int choice=s.nextInt();
			if(choice == 1) {
				System.out.println("Enter Data !");
				int d=s.nextInt();
				q.enQueue(d);
			}
			else if (choice == 2) {
				int d=q.deQueue();
				if (d == -1) {
					System.out.println(" Queue is Empty ");
				}else {
					System.out.println("The Deleted data from Queue is: "+d);
				}
				
			}
			else if(choice == 3) {
				int d=q.peek();
				System.out.println("The peek data from Queue is: "+d);
			}
			else if(choice == 4) {
				q.display();
			}
			else if(choice == 5) {
				break;
			}
		}

	}

}
