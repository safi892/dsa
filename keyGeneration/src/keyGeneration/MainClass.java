package keyGeneration;
import java.util.Arrays;
import java.util.*;
public class MainClass {
	public static int[][] generateKeys(int[] originalKey){
		int[] p10Key=permute10(originalKey);
		int [] first =new int [5];
		int [] second =new int [5];
		int index=0;
		for(int i=0;i<p10Key.length/2;i++) {
			first[i]=p10Key[i];
			index++;
		}
		for(int i=index,j=0;i<p10Key.length;i++,j++) {
			second[j]=p10Key[i];
			index++;
		}
		int[] leftShiftfirst=leftShift(first,1);
		int[] leftShiftsecond=leftShift(second,1);
		int [] combine1=new int[10];
		for(int i=0;i<leftShiftfirst.length;i++) {
			combine1[i]=leftShiftfirst[i];
		}
		for(int i=0;i<leftShiftsecond.length;i++) {
			combine1[i+5]=leftShiftsecond[i];
		}
		
		
		//int[] leftShiftedKey1=leftShift(p10Key,1);
		//int[] leftShiftedKey2=leftShift(leftShiftedKey1,2);
		int[] leftShiftfirst2=leftShift(leftShiftfirst,2);
		int[] leftShiftsecond2=leftShift(leftShiftsecond,2);
		int [] combine2=new int[10];
		for(int i=0;i<leftShiftfirst2.length;i++) {
			combine2[i]=leftShiftfirst2[i];
		}
		for(int i=0;i<leftShiftsecond2.length;i++) {
			combine2[i+5]=leftShiftsecond2[i];
		}
		
		int[] key1=permute8(combine1);
		int[] key2=permute8(combine2);
		return new int[][] {key1,key2};
	}

	
	public static int[] permute10(int[] key) {
		int[] p10= {2,4,1,6,3,9,0,8,7,5};
		return permute(key,p10,10);
	}
	
	
	public static int[] leftShift(int[] key,int numberofShifts) {
		int length=key.length;
		int[] shiftedKey= new int[length];
		for(int i=0;i<length;i++) {
			shiftedKey[i]=key[(i+numberofShifts)%length];
		}
		return shiftedKey;
	}
	
	
	public static int[] permute8(int[] key) {
		int[] p8= {5,2,6,3,7,4,9,8};
		return permute(key,p8,8);
		
	}
	
	
	
	
	
	
	public static int[] permute(int[] key,int[] permutationTable,int newsize) {
		int[] result=new int[newsize];
		for(int i=0;i<newsize;i++) {
			result[i]=key[permutationTable[i]];
			
		}
		return result;
	}


	

	public static void main(String[] args) {
		int[] originalKey= {1,0,1,0,0,0,0,0,1,0};
		int[][] generateKeys=generateKeys(originalKey);
		System.out.println("Original Key: "+Arrays.toString(originalKey));
		System.out.println("Generated Keys : ");
		for(int i=0;i<generateKeys.length;i++) {
			System.out.println("K"+(i+1)+": "+Arrays.toString(generateKeys[i]));
		}
	}
}
	
