package istask1;
import java.util.Scanner;
public class SubjectMarksCalculator {
	public static void main (String [] args) {
   Scanner s =new Scanner(System.in);
   System.out.println("Enter Maximum marks for subject : ");
   double maxMarks=s.nextDouble();
   System.out.println("Enter marks obtained : ");
   double marksobt=s.nextDouble();
   double perct=(marksobt/maxMarks)*100;
   System.out.println("Percentage obtained : "+perct+"%");
   s.close();
}
}