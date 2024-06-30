package playFair;

public class PlayFair {
	private final char[] [] playfairMatrix;
	
	public PlayFair(String key) {
		playfairMatrix=createPlayfairMatrix(key);
	}
	
	
	private char[][] createPlayfairMatrix(String key){
		char [] [] matrix=new char[5][5];
		String keyWithoutDuplicates=removeDuplicateCharacters(key+"ABCDEFGHJKLMNOPQRSTUVWXYZ");
		int row=0,col=0;
		for(char c :keyWithoutDuplicates.toCharArray()) {
			matrix[row][col]=c;
			col++;
			if(col==5) {
				col=0;
				row++;
			}
		}
		return matrix;
	}
	private String removeDuplicateCharacters(String input) {
		StringBuilder result =new StringBuilder();
		for(char c:input.toCharArray()) {
			if(result.indexOf(String.valueOf(c))==-1) {
				result.append(c);
			}
		}
		return result.toString();
	}
	
	private String preprocessText(String plaintext) {
		return plaintext.replaceAll("\\s+", "").toUpperCase();
	}
	
	public String Encrypt(String plaintext) {
		plaintext=preprocessText(plaintext);
		
		StringBuilder cipherText=new StringBuilder();
		int length=plaintext.length();
		for(int i=0 ; i<length; i+=2) {
			char firstChar=plaintext.charAt(i);
			char secondChar=(i +1 <length) ? plaintext.charAt(i + 1) :'X';
			int [] firstPosition=findPosition(firstChar);
			int [] secondPosition=findPosition(secondChar);
			if(firstPosition[0] == secondPosition[0]) {
				//Character are in same row
				cipherText.append(playfairMatrix[firstPosition[0]][(firstPosition[1] + 1) % 5]);
				cipherText.append(playfairMatrix[secondPosition[0]][(secondPosition[1] + 1) % 5]);
				
			}else if(firstPosition[1] == secondPosition[1]) {
				//Character are in same column
				cipherText.append(playfairMatrix[(firstPosition[0] +1)% 5][firstPosition[1]]);
				cipherText.append(playfairMatrix[(secondPosition[0] +1)% 5][secondPosition[1]]);
				
				
			}
			else {
				//Character are in rectangle
				cipherText.append(playfairMatrix[firstPosition[0]][secondPosition[1]]);
				cipherText.append(playfairMatrix[secondPosition[0]][firstPosition[1]]);
				
			}
		}
		return cipherText.toString();
		
	}
	
	private int[] findPosition(char target) {
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				if(playfairMatrix[i][j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
	
	public String Decrypt(String encryptedText) {
		//plaintext=preprocessText(plaintext);
		
		StringBuilder cipherText=new StringBuilder();
		int length=encryptedText.length();
		for(int i=0 ; i<length; i+=2) {
			char firstChar=encryptedText.charAt(i);
			char secondChar=(i +1 <length) ? encryptedText.charAt(i + 1) :'X';
			int [] firstPosition=findPosition(firstChar);
			int [] secondPosition=findPosition(secondChar);
			if(firstPosition[0] == secondPosition[0]) {
				//Character are in same row
				cipherText.append(playfairMatrix[firstPosition[0]][(firstPosition[1]  -1) % 5]);
				cipherText.append(playfairMatrix[secondPosition[0]][(secondPosition[1] - 1) % 5]);
				
			}else if(firstPosition[1] == secondPosition[1]) {
				//Character are in same column
				cipherText.append(playfairMatrix[(firstPosition[0] -1)% 5][firstPosition[1]]);
				cipherText.append(playfairMatrix[(secondPosition[0] -1)% 5][secondPosition[1]]);
				
				
			}
			else {
				//Character are in rectangle
				cipherText.append(playfairMatrix[firstPosition[1]][secondPosition[0]]);
				cipherText.append(playfairMatrix[secondPosition[1]][firstPosition[0]]);
				
			}
		}
		return cipherText.toString();
		
	}
	
	
	
	
	

}
