package weak5task1;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String Value");
		String t=s.next();
		
		String r="";
		Stack st=new Stack(t.length());
		for(int i=0;i<t.length();i++) {
			char c=t.charAt(i);
			st.push(c);
			r=r+c;
			
		}
		String res="";
		for(int i=0;i<r.length();i++) {
			char ch=st.pop();
			res=res+ch;
			
		}
		System.out.println(res);
		
		if(t.equalsIgnoreCase(res)) {
			System.out.println("String is Palidrome");
		}else {
			System.out.println("String is Not Palidrome");
		}
		System.out.println("Enter Integer Value");
		int in=s.nextInt();
		
		String ir="";
		while (in>0) {
			 ir=(in%2)+ir;
			in/=2;
			
			
		}
		Stack sd=new Stack(ir.length());
		String binary="";
		for(int i=0;i<ir.length();i++) {
			char ch=ir.charAt(i);
			binary=binary+ch;
			
		}
		System.out.println(binary);
		String rers="";
		for(int i=0;i<binary.length();i++) {
			char ch=st.pop();
			rers=rers+ch;
			
		}
		System.out.println(rers);
		
		/*
		for(int i=0;i<in.length();i++) {
			int ser=in%2;
			
			st.push(ser);
			ir=ir+c;
			
			
		}
		*/
	}

}
