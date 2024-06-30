package weak4task1;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		linkedList l=new linkedList();
		int choice;
		int count=0;
		while(true) {
			System.out.println("Press 1 for Add Temperature :");
			System.out.println("Press 2 for Display Temperature :");
			System.out.println("Press 3 for Average Temperature :");
			System.out.println("Press 4 for Minimum Temperature :");
			System.out.println("Press 5 for Maximum Temperature :");
			System.out.println("Press 6 for Total Temperature :");
			System.out.println("Press 7 for Exit !");
			choice=s.nextInt();
			if(choice==1) {
				System.out.println("Enter Temperature :");
				float t=s.nextFloat();
				l.insertatFirst(t);
				count++;
			}
			else if(choice==2) {
				l.display();
			}
			else if(choice==3) {
				double  average=(l.average())/count;
				System.out.println("Average Temperature :"+average);
			}
			else if(choice==4) {
				Float min=l.Mininmum();
				System.out.println("Minimum Temperature :"+min);
			}
			else if(choice==5) {
				Float max=l.Maximum();
				System.out.println("Maximum Temperature :"+max);
			}
			else if(choice==6) {
				double sum=l.average();
				System.out.println("Total Temperature :"+sum);
			}
			
			
			
			else if(choice==7) {
				break;
			}
		}//loop

	}

}
