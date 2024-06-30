package march27;

import java.util.Scanner;




public class MainClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int choice;
		Stack st=new Stack(10);
		
		while(true) {
			System.out.println("Press 1 for Enter Command :");
			System.out.println("Press 2 for Check Previous Command :");
			
			System.out.println("Press 3 for view Command Histroy :");
			System.out.println("Press 4 for Exit !");
			choice=s.nextInt();
			if(choice==1) {
				System.out.println("Enter Command :");
				String c=s.next();
				
				st.push(c);
			}
			else if(choice==2) {
				String r=st.pop();
				System.out.println("Your Last Command Histroy is :"+r);
				//st.push(r);
				
			}
			else if(choice==3) {
				st.display();
			
				/*
				Stack temp=new Stack(10);
				int t=st.getIndex() ;
				for(int i=0;i<=t;i++) {
					String c=st.pop();
					
					System.out.println("All Command Histroy is :"+c);
					temp.push(c);
					
				}
				for(int i=0;i<=t;i++) {
					st.push(temp.pop());
				}
				*/
			}
			else if(choice==4) {
				break;
			}
			
			
			
			
		}//loop

	}

}
