package apr4;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("Enter Integer Value");
		int num=s.nextInt();
		
		Stack st=new Stack(20);
		String ir="";
		for  (int i=0;num>0; ) {
			 ir=(num%2)+ir;
			 char ch=ir.charAt(i);
			 st.push(ch);
			num/=2;
		}
		
		String res="";
		for(int i=0;i<ir.length();i++) {
			char ch=st.pop();
			res=res+ch;
			
		}
		System.out.println("Binary is :"+res);

	}

}
