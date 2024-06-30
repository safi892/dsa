package may166;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int choice;
		BST b= new BST();
		while(true) {
			System.out.println("Press 1 for Add Data :");
			System.out.println("Press 3 to Display Maximum Value :");
			System.out.println("Press 4 to  Display Minimum Value :");
			System.out.println("Press 5 for Exit !");
			choice=s.nextInt();
			if(choice==1) {
				Student st= new Student();
				System.out.println("Enter Student ID ");
				st.id=s.nextInt();
				System.out.println("Enter Student Name ");
				st.name = s.next();
				
				System.out.println("Enter Student Cgpa ");
				st.cgpa =s.nextFloat();
			
				b.insert(st);
			}
			
			else if(choice == 3) {
				b.maximum();
				
				
			}
			else if(choice == 4) {
				Student p= b.minimum();
				System.out.println("Minimum Value is:"+p.id);
				System.out.println("Minimum Value is:"+p.name);
				System.out.println("Minimum Value is:"+p.cgpa);
			}
			
			else if(choice == 5) {
				break;
			}
		}//loop

	}

}
