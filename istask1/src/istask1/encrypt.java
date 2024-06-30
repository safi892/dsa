package istask1;

public class encrypt {  // ceasercipher
	
	public static String encryption(String message, int shift) {
		//StringBuilder encryptMessage =new StringBuilder();
		String cipherText="";
		char cipherch = 0;
		
		for(int i=0;i<message.length();i++) {
			char ch=message.charAt(i);
			cipherch=(char) (ch+shift);
			
			cipherText+=cipherch;
		}
		
		return cipherText;
	}
	
	public static String decryption(String message, int shift) {
		//StringBuilder decryptMessage =new StringBuilder();
		String cipherText="";
		char cipherch = 0;
		
		for(int i=0;i<message.length();i++) {
			char ch=message.charAt(i);
			cipherch=(char) (ch-shift);
			
			cipherText+=cipherch;
		}
		
		return cipherText;
	}

}
