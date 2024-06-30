package des3;
import java.util.Scanner;

public class aesFunct {
	private static final int[][] roundConstants={
			    
		{0x01, 0x00, 0x00, 0x00},
		{0x02, 0x00, 0x00, 0x00},
		{0x04, 0x00, 0x00, 0x00},
		{0x08, 0x00, 0x00, 0x00},
		{0x10, 0x00, 0x00, 0x00},
		{0x20, 0x00, 0x00, 0x00},
		{0x40, 0x00, 0x00, 0x00},
		{0x80, 0x00, 0x00, 0x00},
		{0x1b, 0x00, 0x00, 0x00},
		{0x36, 0x00, 0x00, 0x00}};

	private static final int[][] sBox = {
	
	{0x63, 0x7c, 0x77, 0x7b, 0xf2, 0x6b, 0x6f, 0xc5, 0x30, 0x01, 0x67, 0x2b, 0xfe, 0xd7,0xab, 0x76}};
	
	
	private static final int N=4;
//	private static final int e0 = 0;
//	private static final int f6 = 0;
//	private static final int a8 = 0;
//	private static final int a2 = 0;
	
	public static void main(String [] args) {
		
		byte [][] state= {
				{0x32, (byte) 0x88, 0x31,(byte) ( 0xe0)},
				{0x43, (byte)(0x5a), 0x31, 0x37},
				{(byte) (0xf6), 0x30, (byte) 0x98, 0x07},
				{(byte) (0xa8), (byte) (0x8d), (byte) (0xa2), 0x34}
				
				
		};
		
		byte [][] roundkey= {
				{(byte)(0x2b), 0x28, (byte) 0xab, 0x09},
				{(byte)  (0x7e), (byte) (0xae), 0x57, (byte) 0xcf},
				{0x15, (byte) 0xd2, 0x15, (byte) (0x4f)},
				{0x16, (byte) (0xa6), (byte) 0x88, (byte) (0x3c)}
				
				
		};
		System.out.println("Result Before Round key");
		printMatrix(state);
		addRoundkey(state,roundkey);
		System.out.println("Result after Round key");
		printMatrix(state);
		
		shiftRows(state);
		
	}
	
	private static void addRoundkey(byte [][] state,byte [][] roundkey) {
		
		for (int i=0; i <N;i++) {
			
			for(int j=0; j <N;j++) {
				
				state[i][j] ^= roundkey[i][j];
			}
		}
		
	}
	private static void  printMatrix(byte[][] matrix) {
		for (int i=0; i <N;i++) {
			
			for(int j=0; j <N;j++) {
				System.out.print(String.format("  %02x",matrix[i][j]));
				
			}
			System.out.println();
			
		}
	}
	
	private static void subBytes(int[][] state) { //subsitute
		
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < N; col++) {
				int value = state[row][col];
			
				int rowIdx = (value >>> 4) & 0x0F;
				int colIdx = value & 0x0F;
				state[row][col] = sBox[rowIdx][colIdx];
			}
		}
	}
	
	// ShiftRows: Shift each row in the state to the left by an offset private
	
	static void shiftRows(int[][] state) {
	for(int row = 1;row<4;row++){
		for (int i = 0; i < row; i++) {
			int temp = state[row][0];
			for (int col = 0; col < N - 1; col++) {
				state[row][col] = state[row][col + 1];
				state[row][N-1]=temp;
			}
		}
	}
}

		

}
