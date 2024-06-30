package istask1;
import java.util.Scanner;
public class polyalphabetic {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		poly p=new poly();
		//char[] Alphabet={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		System.out.println("Enter String");
		String st=s.next();
		System.out.println("Enter Key");
		String k=s.next();
		System.out.println("Orignal :"+st);
		String n=p.encryption(st,k);
		System.out.println("Encryption :"+n);
		
		String dec1=p.decryption(n, k);
		System.out.println("Decryption :"+dec1);

	}

}
