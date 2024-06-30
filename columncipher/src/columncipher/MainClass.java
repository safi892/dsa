package columncipher;

public class MainClass {
	public static void sort(char[] arr) {
	    
        int n = arr.length;
        //char[] carr =new char [30];
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
            	if (arr[j] < arr[min_idx]) {
                	min_idx = j;
                }
            }
                
                    

            // Swap the found minimum element with the first
            // element
            char temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		column cl=new column();
		String plaintext = "INFORMATIONSECOURITY";
		char[] arr =new char[plaintext.length()];
		for(int i=0;i<arr.length;i++) {
        	arr[i]=plaintext.charAt(i);
        }
		sort(arr);
		System.out.println("Text is : "+plaintext);
//		String key = "3241"; // The key defines the column order
//		String ciphertext = cl.encrypt (plaintext, key);
//		System.out.println("Encrypted Text: " + ciphertext);
//		String decryptedText = cl.decrypt (ciphertext, key);
//		System.out.println("Decrypted Text: " + decryptedText);
//		
		
	}

}
