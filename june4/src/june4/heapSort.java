package june4;
import java.util.Scanner;

public class heapSort {
	public static void heapifyDown(int pos, int index,employee[] data) {
		int minIndex =pos;
		while (true) {
			int left = (minIndex*2)+1;
			int right = (minIndex*2)+2;
			if(left <= index && data[left].age > data[minIndex].age) {
				minIndex=left;
			}
			if(right <= index && data[right].age > data[minIndex].age) {
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
	
	public static void swap(employee[] arr,int p1,int p2) {
		employee temp=arr[p2];
		arr[p2]=arr[p1];
		arr[p1]=temp;
	}
	public static void converArrayToHeap(employee[] arr) {
		int start= (arr.length/2 )-1;
		for(int i= start;i>=0 ;i--) {
			heapifyDown(i,arr.length-1,arr);
		}
	}
	public static void heapSort(employee[] arr) {
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
		employee[] arr = new employee[4];
		//int [] arr= {4,78,59,8,9,23,56};
		
		for(int i=0;i<arr.length;i++) {
			employee em= new employee();
			System.out.println("Enter NAme :");
			em.name= s.next();
			System.out.println("enter age :");
			em.age=s.nextInt();
			arr[i]=em;
		}
		heapSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Name is "+arr[i].name);
			System.out.println("Age is "+arr[i].age);
		}
		
	}

}

