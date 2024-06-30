package columncipher;

public class column {

		public static String encrypt(String plaintext, String key) {
			int keyLength = key.length();
			int textLength = plaintext.length();
			// Calculate the number of rows required
			int numRows = (int) Math.ceil((double) textLength / keyLength);
			// Create a 2D array to hold the characters 
			char[][] grid = new char[numRows] [keyLength];
			// Fill the grid with the plaintext characters 
			int index = 0;
			for (int row = 0; row < numRows; row++) {
				for (int col = 0; col< keyLength; col++) {
					if (index < textLength) {
					grid[row][col] = plaintext.charAt(index); index++;
					}
				}
			}
			// Build the ciphertext by reading columns based on the key order 
			StringBuilder ciphertext = new StringBuilder();
			for (int col = 0; col< keyLength; col++) {
			int keyIndex = key.indexOf(col + '1');
				for (int row = 0; row < numRows; row++) {
					if (grid[row] [keyIndex] != 0) {
					ciphertext.append(grid[row] [keyIndex]);
					}
				}
			}
			return ciphertext.toString();
		}
		
		
		public static String decrypt (String ciphertext, String key) {
			int keyLength = key.length();
			int textLength = ciphertext.length();
			// Calculate the number of rows required
			int numRows = (int) Math.ceil((double) textLength / keyLength);
			// Calculate the number of columns in the last row
			int lastRowCols = textLength % keyLength;
			// Create a 2D array to hold the characters
			char[] [] grid = new char[numRows] [keyLength];
			// Fill the grid with the ciphertext characters
			int index = 0;
			for (int col = 0; col < keyLength; col++) {
				int keyIndex = key.indexOf(col + '1');
				int rowEnd = (keyIndex < lastRowCols) ? numRows -1 : numRows;
						for (int row = 0; row < rowEnd; row++) {
							grid[row] [keyIndex] = ciphertext.charAt(index);
							index++;
						}
			}
			StringBuilder plaintext = new StringBuilder();
			for (int row = 0; row < numRows; row++) {
				for (int col = 0; col < keyLength; col++) {
					plaintext.append(grid[row][col]);
				}
			}
			return plaintext.toString();
		
		}
}
