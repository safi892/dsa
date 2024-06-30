package keyGeneration;

public class main {
	public static int[] p4(int[] input) { 
        int [] p = {1, 3, 2, 0};

        return permute(input ,p,4);
    }




    public static int[] permute(int[] input, int[] permutationTable, int newsize) {
        int[] result = new int[newsize];
        for (int i = 0; i < newsize; i++) {
        	result[i] = input[permutationTable[i]];
        }
        
        return result;
    }
public static int[] S_DES_XOR(int[] EP, int[] key) {
    	
		int index=0;
		int[] res=new int[key.length];
		for(int i =0,j=0;i<key.length;i++,j++) {
			if(key[i] == EP[i]) {
				res[index] =0;
				index++;
			}else {
				res[index] =1;
				index++;
			}
		}
//		System.out.println("REsult");
//		for(int i=0;i<res.length;i++) {
//			System.out.println(res[i]);
//		}
		return res;
    }
	static int ConvertRows(String a) {
		if(a.equals("00")) {
			return 0;
		}
		else if(a.equals("01")) {
			return 1;
		}
		else if(a.equals("10")) {
			return 2;
		}
		else if(a.equals("11")) {
			return 3;
		}
		return 0;
	}
	static int ConvertCols(String a) {
		if(a.equals("00")) {
			return 0;
		}
		else if(a.equals("01")) {
			return 1;
		}
		else if(a.equals("10")) {
			return 2;
		}
		else if(a.equals("11")) {
			return 3;
		}
		return 0;
	}
	static String So(int[] first) {
		String [][] so = {
				{"01","00","11","10"},
				{"11","10","01","00"},
				{"00","10","01","11"},
				{"11","01","11","10"},
		};
		String row="";
		String col="";
		row=row+Integer.toString(first[0]);
		row=row+Integer.toString(first[first.length-1]);
		col=col+Integer.toString(first[1]);
		col=col+Integer.toString(first[2]);
		int r=ConvertRows(row);
		int c=ConvertCols(col);
		String rr=so[r][c];
		return rr;
	}
	static String S1(int[] second) {
		String [][] s1 = {
				{"00","01","10","11"},
				{"10","00","01","11"},
				{"11","00","01","00"},
				{"10","01","00","11"},
		};
		String row2="";
		String col2="";
		row2=row2+Integer.toString(second[0]);
		row2=row2+Integer.toString(second[3]);
		col2=col2+Integer.toString(second[1]);
		col2=col2+Integer.toString(second[2]);
		int r2=ConvertRows(row2);
		int c2=ConvertCols(col2);
		String cc=s1[r2][c2];
		return cc;
	}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int key[] = {1, 0, 1, 0, 0, 1 ,0, 0};
		int[] EP = {1,0,0,1,0,1,1,0};
		int index=0;
		int[] res=new int[key.length];
		for(int i =0,j=0;i<key.length;i++,j++) {
			if(key[i] == EP[i]) {
				res[index] =0;
				index++;
			}else {
				res[index] =1;
				index++;
			}
		}
		System.out.println("REsult");
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]);
		}
		System.out.println("////////////");
		int [] first =new int [4];
		int [] second =new int [4];
		int count=0;
		
		for(int i=0;i<res.length;i++) {
			if(i<4) {
				first[i]=res[i];
			}else {
				second[count]=res[i];
				count++;
			}
		}
		for(int i=0;i<first.length;i++) {
			System.out.println(first[i]);
		}
		System.out.println("////////////");
		for(int i=0;i<second.length;i++) {
			System.out.println(second[i]);
		}
		
		System.out.println("////////////");
//		String row="";
//		String col="";
//		row=row+Integer.toString(first[0]);
//		row=row+Integer.toString(first[first.length-1]);
//		col=col+Integer.toString(first[1]);
//		col=col+Integer.toString(first[2]);
//		int r=ConvertRows(row);
//		int c=ConvertCols(col);
//		System.out.println("////////////");
//		
//		String [][] so = {
//				{"01","00","11","10"},
//				{"11","10","01","00"},
//				{"00","10","01","11"},
//				{"11","01","11","10"},
//		};
//		String rr=so[r][c];
//		System.out.println(rr+"so");
		
		////////////////////////////
		String f;
		String f0=So(first);
		String f1=S1(second);
		f=f0+f1;
		System.out.println(f0+"soo");
		System.out.println(f1+"s111");
		System.out.println(f+"ffffffffff111");
		
		
		
		String [][] s1 = {
				{"00","01","10","11"},
				{"10","00","01","11"},
				{"11","00","01","00"},
				{"10","01","00","11"},
		};
//		String row2="";
//		String col2="";
//		row2=row2+Integer.toString(second[0]);
//		row2=row2+Integer.toString(second[3]);
//		col2=col2+Integer.toString(second[1]);
//		col2=col2+Integer.toString(second[2]);
//		int r2=ConvertRows(row2);
//		int c2=ConvertCols(col2);
//		String cc=s1[r2][c2];
//		System.out.println("s1"+cc);
//		String finale=rr+cc;
//		System.out.println("final"+finale);
		int [] arr= new int[4];
		for(int i=0;i<f.length();i++) {
			char ch=f.charAt(i);
			int a= ch-'0';
			arr[i]=a;
					
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int [] newarr=p4(arr);
		for(int i=0;i<newarr.length;i++) {
			System.out.println(newarr[i]);
		}
		int ipleft[] = {1,0,0,1};
		
		int [] ress =S_DES_XOR(newarr,ipleft);
		for(int i=0;i<ress.length;i++) {
			System.out.print(ress[i]);
		}
		
	}

}
