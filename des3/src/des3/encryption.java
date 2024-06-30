package des3;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.spec.KeySpec;
import java.util.Scanner;

public class encryption {
	public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter plainText: ");
        String plainText = scanner.next();
        System.out.print("Enter KeyString: ");
        String keyString = scanner.next();


        byte[] keyBytes = keyString.getBytes();


        KeySpec keySpec = new DESKeySpec(keyBytes);


        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey key = keyFactory.generateSecret(keySpec);


        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);


        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());


        System.out.println("Encrypted: " + new String(encryptedBytes));


        Cipher decryptCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        decryptCipher.init(Cipher.DECRYPT_MODE, key);


        byte[] decryptedBytes = decryptCipher.doFinal(encryptedBytes);


        System.out.println("Decrypted: " + new String(decryptedBytes));
    }
}
