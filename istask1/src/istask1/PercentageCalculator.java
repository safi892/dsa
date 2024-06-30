package istask1;
import java.util.Scanner;
public class PercentageCalculator {
public static void main(String [] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter marks of DS out of 80");
	int ds=s.nextInt();
	float p1=(ds*100)/80;
	System.out.println("Percentage of DS : "+p1+"%");
	if(p1>=80) {
		System.out.println("Grade A");
	}
	else if(p1>=60&&p1<80) {
		System.out.println("Grade B");
	}
	else if(p1>=40&&p1<60) {
		System.out.println("Grade C");
	}
	else if(p1>=30&&p1<40) {
		System.out.println("Grade D");
	}
	else if(p1<30) {
		System.out.println("Grade F");
	}
	

	System.out.println("Enter marks of PBS out of 60");
	int pbs=s.nextInt();
	float p2=(pbs*100)/60;
	System.out.println("Percentage of PBS : "+p2+"%");
	if(p2>=80) {
		System.out.println("Grade A");
	}
	else if(p2>=60&&p2<80) {
		System.out.println("Grade B");
	}
	else if(p2>=40&&p2<60) {
		System.out.println("Grade C");
	}
	else if(p2>=30&&p2<40) {
		System.out.println("Grade D");
	}
	else if(p2<30) {
		System.out.println("Grade F");
	}
	
	
	System.out.println("Enter marks of AI out of 60");
	int ai=s.nextInt();
	float p3=(ai*100)/60;
	System.out.println("Percentage of AI : "+p3+"%");
	if(p3>=80) {
		System.out.println("Grade A");
	}
	else if(p3>=60&&p3<80) {
		System.out.println("Grade B");
	}
	else if(p3>=40&&p3<60) {
		System.out.println("Grade C");
	}
	else if(p3>=30&&p3<40) {
		System.out.println("Grade D");
	}
	else if(p3<30) {
		System.out.println("Grade F");
	}
	int sum=ds+pbs+ai;
	System.out.println("Overall Percentage :"+(sum*100)/200+"%");
	
}
}
