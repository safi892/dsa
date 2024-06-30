package p1;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;


public class RSAExample {
	private static BigInteger privateKey;
	private static BigInteger publicKey;
	private static BigInteger modulus;


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Step 1: Key Generation 
		generateKeys();
		// Display the generated keys
		System.out.println("Public Key:" + publicKey); 
		System.out.println("Private Key: " + privateKey); 
		System.out.println("Modulus: "+ modulus);
		System.out.print("\nEnter a message to encrypt: "); 
		String message = scanner.nextLine();
		
		BigInteger encryptedMessage = encrypt (message); 
		System.out.println("Encrypted Message: " + encryptedMessage);
		// Step 3: Decryption
		BigInteger decryptedMessage = decrypt (encryptedMessage);
		 System.out.println("Decrypted Message: " + decryptedMessage);
		scanner.close();
	}
	private static void generateKeys() {
		// Choose two large prime numbers 
		BigInteger p = new BigInteger (512, 100, new SecureRandom()); 
		BigInteger q = new BigInteger (512, 100, new SecureRandom());
		//Compute n = pq 
		modulus = p.multiply(q);
		// Compute (n) = (p-1)(q-1)
		BigInteger phi = (p.subtract (BigInteger.ONE)). multiply (q.subtract (BigInteger.ONE));
		// Choose a public key e such that 1 <e < (n) and gcd(e, (n)) = 1
		publicKey = new BigInteger ("65537"); // Commonly used public exponent
		// Compute the private key d such that d = e^(-1) (mod (n)) 
		privateKey = publicKey.modInverse(phi);
	}
	
	private static BigInteger encrypt (String message) { 
		byte[] bytes = message.getBytes();
		BigInteger plaintext = new BigInteger (bytes);
		return plaintext.modPow(publicKey, modulus);
	}
	
	private static BigInteger decrypt(BigInteger encryptedMessage) { 
		return encryptedMessage.modPow(privateKey, modulus);
	}


}
