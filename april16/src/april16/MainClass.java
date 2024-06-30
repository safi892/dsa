package april16;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Queue obj = new Queue();
		int choice;
		
		while (true) {
			System.out.println("Enter 1 to Submit Print Jobs :");
			System.out.println("Enter 2 to Process Print Jobs :");
			System.out.println("Enter 3 for Check which Data has next Turn :");
			System.out.println("Enter 4 for for view Count");
			System.out.println("Enter 5 to Exit :");
			choice=s.nextInt();
			
			if(choice == 1) {
				
				System.out.println("Enter Data:");
				int d =s.nextInt();
				obj.enQueue(d);
			}
			else if(choice == 2) {
				int d;
				d = obj.deQueue();
				if(d == 0) {
					System.out.println("No data");
				}else {
					System.out.println("Data = "+d);
					
				}
				
			}
			else if(choice == 3) {
				int d;
				d = obj.peek();
				if(d==0) {
					System.out.println("No data");
				}else {
					System.out.println("Data = "+d);
					
				}
			}
			else if(choice == 4) {
				obj.display();
			}
			
			
			else if(choice == 5) {
				break;
			}
			
			
			
			
		}

	}

}
