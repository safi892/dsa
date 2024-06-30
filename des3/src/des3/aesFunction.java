package des3;

public class aesFunction {
	private static void subBytes(int[][] state) {
		
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < Nb; col++) {
				int value = state[row][col];
			}
			int rowIdx = (value >>> 4) & 0x0F;
			int colIdx = value & 0x0F;
			state[row][col] = sBox[rowIdx][colIdx];
		}
	}
	// ShiftRows: Shift each row in the state to the left by an offset private
	// 
	static void shiftRows(int[][] state) {
	for(int row = 1;row<4;row++){
		for (int i = 0; i < row; i++) {
			int temp = state[row][0];
			for (int col = 0; col < Nb - 1; col++) {
				state[row][col] = state[row][col + 1];
				state[row][Nb-1]=temp;
			}
		}
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		﻿

		// SubBytes: Substitute each byte in the state using the S-Box 
		
}

}
