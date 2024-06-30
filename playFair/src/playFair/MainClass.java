package playFair;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Plain Text :");
		String text=s.next();
		String t=text.toUpperCase();
		System.out.println("Enter Key :");
		String key=s.next();
		System.out.println("Plain Text :"+t);
		PlayFair cipher=new PlayFair(key.toUpperCase());
		
		String encryptedText=cipher.Encrypt(t);
		System.out.println("Encrypted Text :"+encryptedText);
		
		
	}

}
