package april1;
import java.util.Scanner;
public class mainClass {
	public static String convertToPostfix(String infix) {
		Stack s =new Stack(infix.length());
		String postfix="";
		for (int i=0;i<infix.length();i++) {
			char ch=infix.charAt(i);
			if(ch>='0' && ch<='9') {
				postfix=postfix+" "+ch;
			}
			
			else if(ch=='(') {	
				s.push(ch);
			}
			else if (ch==')'){
				while(s.peak()!='(') {
					postfix=postfix+" "+s.pop();
				}
				s.pop();
			}
			else if(ch=='+') {
				while(s.peak()=='-' || s.peak()=='*' || s.peak()=='/'  ) {
					postfix=postfix+" "+s.pop();
				}
				s.push(ch);
			}
			else if(ch=='-') {
				while(s.peak()=='+' || s.peak()=='*' || s.peak()=='/'  ) {
					postfix=postfix+" "+s.pop();
				}
				s.push(ch);
			}
			else if(ch=='*') {
				while(s.peak()=='/'  ) {
					postfix=postfix+" "+s.pop();
				}
				s.push(ch);
			}
			else if(ch=='/') {
				while(s.peak()=='*'  ) {
					postfix=postfix+" "+s.pop();
				}
				s.push(ch);
			}
		}
		while(s.peak()!='\0') {
			postfix=postfix+" "+s.pop();
		}
		return postfix;
	}
	public static void evaluate(String postfix) {
		intStack s=new intStack(postfix.length());
		for (int i=0;i<postfix.length();i++) {
			char ch=postfix.charAt(i);
			
			if(ch>='0' && ch<='9' ||ch=='-' || ch=='*' || ch=='/' ||ch=='+' ) {
				if(ch>='0' && ch<='9') {
					s.push(ch-48);
					
				}else {
				int rop=s.pop();
				int lop=s.pop();
				int res =lop+rop;
				if(ch=='-') {
					res=lop-rop;
				}
				
				else if(ch=='*') {
					res=lop*rop;
				}
				else if(ch=='/') {
					res=lop/rop;
				}
				s.push(res);
				}
				
			}
		}//loop
		System.out.println("Result :"+s.pop());
	}
	

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println();
		String t=s.next();
		System.out.println(convertToPostfix(t));
		String p=convertToPostfix(t);
		evaluate(p);
		

	}

}
