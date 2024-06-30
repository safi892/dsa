package april15;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Queue obj = new Queue();
		int choice;
		
		while (true) {
			System.out.println("Enter 1 to Add DegreeDetails :");
			System.out.println("Enter 2 to Remove DegreeDetails :");
			System.out.println("Enter 3 for Check Peek :");
			System.out.println("Enter 4 to exit :");
			choice=s.nextInt();
			
			if(choice == 1) {
				DegreeDetails d=new DegreeDetails();
				System.out.println("Enter Name :");
				d.name =s.next();
				System.out.println("Enter Degree :");
				d.degree =s.next();
				System.out.println("Enter Passsing Year :");
				d.pasingYear =s.nextInt();
				obj.enQueue(d);
			}
			else if(choice == 2) {
				DegreeDetails d;
				d = obj.deQueue();
				if(d==null) {
					System.out.println("No data");
				}else {
					System.out.println("Name = "+d.name);
					System.out.println("Discipline = "+d.degree);
					System.out.println("Passing Year = "+d.pasingYear);
				}
				
			}
			else if(choice == 3) {
				DegreeDetails d;
				d = obj.peek();
				if(d==null) {
					System.out.println("No data");
				}else {
					System.out.println("Name = "+d.name);
					System.out.println("Discipline = "+d.degree);
					System.out.println("Passing Year = "+d.pasingYear);
				}
			}
			
			else if(choice == 4) {
				break;
			}
			
			
			
			
		}

	}

}
