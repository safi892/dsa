package istask1;

public class poly {
	
	public static String encryption(String message, String key) {
		
		String cipherText="";
		
		String Alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<message.length();i++) {
			char ch=message.charAt(i);
			int index=Alphabet.indexOf(ch);
			char ck=key.charAt(i%key.length());
			int kindex=Alphabet.indexOf(ck);
			
			int newindex=(index+kindex)%26;
			char newchar=Alphabet.charAt(newindex);
			
			
			cipherText+=newchar;
		}
		
		return cipherText;
	}
	
	public static String decryption(String message, String key) {
		
		String cipherText="";
		
		String Alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<message.length();i++) {
			char ch=message.charAt(i);
			int index=Alphabet.indexOf(ch);
			char ck=key.charAt(i%key.length());
			int kindex=Alphabet.indexOf(ck);
			
			int newindex=(index-kindex)%26;
			if(newindex<0) {
				newindex=newindex+26;
			}
			char newchar=Alphabet.charAt(newindex);
			
			
			cipherText+=newchar;
		}
		
		return cipherText;
	}
	
	

}
