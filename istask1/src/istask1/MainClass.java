package istask1;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		encrypt e=new encrypt();
		
		System.out.println("Enter String");
		String st=s.next();
		System.out.println("Enter Key");
		int k=s.nextInt();
		System.out.println("Orignal :"+st);
		String n=e.encryption(st,k);
		System.out.println("Encryption :"+n);
		
		String dec1=e.decryption(n, k);
		System.out.println("Decryption :"+dec1);
	}

}
