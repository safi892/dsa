package istask1;
import java.util.Scanner;
public class BasicComputation {
	
	public static void main (String [] args) {
     Scanner s=new Scanner(System.in);
     
     //Exercise 2.1
     
     
    
     
     
     
     /*
     System.out.println("Enter first number ");
     int a=s.nextInt();
     System.out.println("Enter second number ");
     int b=s.nextInt();
     System.out.println("a^b = "+(a^b));
     System.out.println("a&b = "+(a&b));
     System.out.println("a|b = "+(a|b));
     
     */
     
     
     /*
     System.out.println(" First character ");
     String a=s.next();
     System.out.println(" Second character ");
     String b=s.next();
     int j=0;
     char xoredChar=(char)(a.charAt(j)^b.charAt(j));
     System.out.printf("'%c' = %d\n",xoredChar,(int) xoredChar);
    
    
     */
     

     String st="JKLMN";
     int shifting=3;
     for(int i=0;i<st.length();i++) {
    	 char cf=st.charAt(i);
    	 char sh=(char) (cf-shifting);
    	 System.out.print(sh);
    	 
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
     
     
     
     
     
     
     
     
     
     
     
}
}