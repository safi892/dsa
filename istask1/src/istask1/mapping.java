package istask1;

public class mapping {

	public static void main(String[] args) {
	
		String plainText="AELLO";//
		String t="";
		System.out.println("Orignal Text :"+plainText);
		char[] Alphabet={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		System.out.print("Encrypted:");
		for(int i=0;i<plainText.length();i++) {
			char c=plainText.charAt(i);
		   if(Character.isLetter(c)) {
			   int ind=c-'A';
			   int index=(ind+13)%26;
			   c=Alphabet[index];
			   System.out.print(c);
			   t=t+c;
			  
		   }
		 
		}
		System.out.println();
		System.out.print("Decrypted:");
		for(int i=0;i<t.length();i++) {
			char c=t.charAt(i);
		   if(Character.isLetter(c)) {
			   int ind=c+'A';
			   int index=(ind-13)%26;
			   c=Alphabet[index];
			  
			   System.out.print(c);
			  
			  
		   }
		 
		}
		
		
}
}

