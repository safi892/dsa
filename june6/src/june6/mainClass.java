package june6;

import java.util.Scanner;



public class mainClass {

	public static void heapifyDown(int pos, int index,Student[] data) {
		int minIndex =pos;
		while (true) {
			int left = (minIndex*2)+1;
			int right = (minIndex*2)+2;
			if(left <= index && data[left].grade < data[minIndex].grade) {
				minIndex=left;
			}
			if(right <= index && data[right].grade < data[minIndex].grade) {
				minIndex=right;
			}
			if(minIndex!= pos) {
				swap(data,pos,minIndex);
				pos = minIndex;
			}
			else {
				break;
			}
		}//loop
	}
	
	public static void swap(Student[] arr,int p1,int p2) {
		Student temp=arr[p2];
		arr[p2]=arr[p1];
		arr[p1]=temp;
	}
	public static void converArrayToHeap(Student[] arr) {
		int start= (arr.length/2 )-1;
		for(int i= start;i>=0 ;i--) {
			heapifyDown(i,arr.length-1,arr);
		}
	}
	public static void heapSort(Student[] arr) {
		converArrayToHeap(arr);
		int last = arr.length-1;
		while(last>0) {
			swap(arr,0,last);
			last--;
			heapifyDown(0,last,arr);
		}
	}
	public static void main(String [] args) {
		Scanner s= new Scanner(System.in);
		Student[] arr = new Student[5];
		
		for(int i=0;i<arr.length;i++) {
			Student em= new Student();
			System.out.println("enter grade :");
			em.grade=s.nextInt();
			arr[i]=em;
		}
		heapSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Grade is :"+arr[i].grade);
		}
		
	}

}
