package aa;

public class forSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 3, 90, 34, -1, -4, 6, 55, 20, -65 };
		
		int [] first =new int [5];
		int [] second =new int [5];
		int index=0;
		int temp;
		for(int i=0;i<5;i++) {
			first[i]=arr[i];
			index++;
		}
		for(int i=0;i<first.length;i++) {
			System.out.println(first[i]);
			
		}
		System.out.println(index);
		
		for(int i=index,j=0;i<arr.length;i++,j++) {
			second[j]=arr[index];
			index++;
		}
		
		for(int i=0;i<second.length;i++) {
			System.out.println(second[i]);
		}
		
		
		/*
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}

		*/

		

	}// main

}
