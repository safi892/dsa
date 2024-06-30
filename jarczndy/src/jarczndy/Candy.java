package jarczndy;
import java.util.Scanner;
public class Candy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		stack st=new stack(10);
		st.push('r');
		st.push('r');
		st.push('b');
		st.push('r');
		st.push('b');
		st.push('y');
		st.push('y');
		st.push('r');

		
		stack temp=new stack(10);
		while(st.peak()!='\0') {
			char c=st.pop();
			if(c=='b') {
				
			}else {
				
				temp.push(c);
			}
			
		}
		System.out.println(temp);
		while(temp.peak()!='\0') {
			st.push(temp.pop());
		}
		
		
	
		
		
		
		
		
		
		
		
	}//main

}
