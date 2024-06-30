package des3;
import javax.crypto.Cipher;


import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import java.security.Key;
import java.security.spec.KeySpec;
import java.util.Scanner;

public class aes {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter plainText: ");
        String plainText = scanner.next();
        System.out.print("Enter KeyString: ");
        String keyString = scanner.next();

        byte[] keyBytes = keyString.getBytes();

        Key keySpec = new SecretKeySpec(keyBytes, "AES");

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);

        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());

        System.out.println("Encrypted: " + new String(encryptedBytes));

        Cipher decryptCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        decryptCipher.init(Cipher.DECRYPT_MODE, (Key) keySpec);

        byte[] decryptedBytes = decryptCipher.doFinal(encryptedBytes);

        System.out.println("Decrypted: " + new String(decryptedBytes));
    }
}