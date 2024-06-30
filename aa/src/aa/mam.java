package aa;

public class mam {

	public static void main(String[] args) {

		
		
		int[][] arr = {
				{1, 2},
				{3, 4},
			  {5, 6}};
//		int rows=arr.length;
//		int cols =arr[0].length;
//		for(int i=0;i<arr.length;i++) {
//			for (int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		//first line
		int res[] =new int[arr.length*arr[0].length];
		int index=0;
		int cols = arr[0].length;
		System.out.println(cols);
		for(int i=0;i<1;i++) {
			for (int j=0;j<arr[i].length;j++) {
				res[index]=arr[i][j];
				index++;
				System.out.print(arr[i][j]+" first");
			}
			System.out.println();
		}
		
		
		//right
		for(int i=1;i<arr.length;i++) {
			for (int j=arr[i].length-1;j<arr[i].length;j++) {
				res[index]=arr[i][j];
				index++;
				System.out.print(arr[i][j]+" right");
			}
			
		}
		System.out.println();
		
		//down
		for(int i=arr.length-1;i<arr.length;i++) {
			for (int j=i-1;j>0;j--) {
				res[index]=arr[i][j];
				index++;
				System.out.print(arr[i][j]+" down");
				
			}
			System.out.println();
		}
		//left
		for(int i=1;i<arr.length-1;i++) {
			for (int j=0;j<arr[i].length-1;j++) {
				res[index]=arr[i][j];
				index++;
				System.out.print(arr[i][j]+" left");
			}
			System.out.println();
		}
//		//centre
//		for(int i=1;i<arr.length-1;i++) {
//			for (int j=1;j<arr[i].length-1;j++) {
//				res[index]=arr[i][j];
//				index++;
//				System.out.print(arr[i][j]+" centre");
//			}
//			System.out.println();
//		}
//		
//		
//		
//		System.out.println(index);
		System.out.println("----------------");
		for(int i=0;i<index;i++) {
			System.out.print(res[i]+" ");
		}
		 
			
			
		
		
	}

}
