package keyGeneration;

import java.util.Arrays;
import java.util.Scanner;

public class sdes_Encryption {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    
        int input[] = {1, 1 ,0 ,0 ,1 ,0 ,1 ,0};
        int key[] = {1, 0, 1, 0, 0, 1 ,0, 0};
        int key2[] = {0, 1, 0, 0, 0, 0 ,1, 1};

        int[] generatedkeys = generatekeys(input,key, key2);
        int [] result =decryption(generatedkeys,key,key2);
        System.out.println("original key : "+Arrays.toString(input));
        System.out.println("Cipher Text: ");
        for(int i = 0;i<generatedkeys.length;i++){
        	System.out.print(generatedkeys[i]);
        	
        }
        
        System.out.println();
        System.out.println("Decryption");
        for(int i = 0;i<result.length;i++){
        	System.out.print(result[i]);
        	
        }

	}//main
	public static int[] generatekeys(int[] input, int[] key,int[] key2) {
		
		
        int[] p8key = ip(input);
        int ipleft[] = new int[4];
        int ipright[] = new int[4];

        for (int i = 0; i < 4; i++) {
            ipleft[i] = p8key[i];
        }
        for (int i = 0; i < 4; i++) {
            ipright[i] = p8key[i + 4];
        }

        System.out.println("Ip left half : ");
        for (int i = 0; i < ipleft.length; i++) { // Ip left half :
            System.out.print(ipleft[i]);
        }

        System.out.println();

        System.out.println("Ip right half : "); // Ip right half :
        for (int i = 0; i < ipright.length; i++) {

            System.out.print(ipright[i]);
        }
        System.out.println();
        int[] EP = E_p8(ipright);
        System.out.println("E/P : "); // E/P
        // -------------------------

        for (int i = 0; i < EP.length; i++) {
            System.out.print(EP[i]);
        }
        System.out.println();
        int XOR_EP[] = S_DES_XOR(EP, key);
        System.out.println("S DES XOR: "); // S DES XOR :
        for (int i = 0; i < XOR_EP.length; i++) {
            System.out.print(XOR_EP[i]);
        }
        System.out.println("//////");/////////////////////////////
        int [] first =new int [4];
		int [] second =new int [4];
		int count=0;
		
		for(int i=0;i<XOR_EP.length;i++) {
			if(i<4) {
				first[i]=XOR_EP[i];
			}else {
				second[count]=XOR_EP[i];
				count++;
			}
		}
		for(int i=0;i<first.length;i++) {
			System.out.println(first[i]+"ffffff");
		}
		System.out.println("////////////");
		for(int i=0;i<second.length;i++) {
			System.out.println(second[i]+"sssssss");
		}
		String f;
		String f1=So(first);
		String f2=S1(second);
		f=f1+f2;
		int [] sos1= new int[4];
		for(int i=0;i<f.length();i++) {
			char ch=f.charAt(i);
			int a= ch-'0';
			sos1[i]=a;
					
		}
		
		int [] p4arr=p4(sos1);
		int [] f1xor=S_DES_XOR(p4arr,ipleft);
		int []cipher2= new int[8];
		for(int i=0,j=0;i<cipher2.length;i++) {
			if(i<4) {
				cipher2[i]=ipright[i];
			}else {
				cipher2[i] = f1xor[j];
				j++;
			}
		}
		for(int i=0;i<cipher2.length;i++) {
			System.out.print(cipher2[i]);
		}
		
		int epleft[] = new int[4];
        int epright[] = new int[4];
        for (int i = 0; i < 4; i++) {
            epleft[i] = cipher2[i];
        }
        for (int i = 0; i < 4; i++) {
            epright[i] = cipher2[i + 4];
        }
        System.out.println("hhhhjhh");
        int[] EP2 = E_p8(epright);
        for(int i=0;i<EP2.length;i++) {
			System.out.print(EP2[i]);
		}
        System.out.println("hhhhjhh");
        int XOR_EP2[] = S_DES_XOR(EP2, key2);
        System.out.println("xor");
        for(int i=0;i<XOR_EP2.length;i++) {
			System.out.print(XOR_EP2[i]);
		}
        System.out.println("xor");
        int [] funct2first =new int [4];
		int [] funct2second =new int [4];
		int count2=0;
		
		for(int i=0;i<XOR_EP2.length;i++) {
			if(i<4) {
				funct2first[i]=XOR_EP2[i];
			}else {
				funct2second[count2]=XOR_EP2[i];
				count++;
			}
		}
		String forf2=So(funct2first)+S1(funct2second);
		System.out.println("sos222"+forf2);
		int [] forf2sos1= new int[4];
		for(int i=0;i<forf2.length();i++) {
			char ch=forf2.charAt(i);
			int a= ch-'0';
			forf2sos1[i]=a;
					
		}
		int [] p4arr2=p4(forf2sos1);
		System.out.println("kkkkkkkkk");
		for(int i=0;i<p4arr2.length;i++) {
			System.out.print(p4arr2[i]);
		}
		System.out.println("kkkkkkkkk");
		int [] f2xor=S_DES_XOR(p4arr2,epleft);
		int []cipher= new int[8];
		for(int i=0,j=0;i<cipher.length;i++) {
			if(i<4) {
				cipher[i]=f2xor[i];
			}else {
				cipher[i] = epright[j];
				j++;
			}
		}
		for(int i=0;i<cipher.length;i++) {
			System.out.print(cipher[i]);
		}
        
        
        return  ip_1(cipher);
        
    }
	//------------------------------------------------------------------------------------
	public static int[] left_XOR_right(int[] input, int[] SOP) { 
	    int rezult[] = new int[4];
	    for (int i = 0; i < input.length; i++) {
	        if(input[i]== 0 && SOP[i] == 0){
	            rezult[i] = 0;
	        }
	        else if (input[i]== 1 && SOP[i] == 1){
	            rezult[i] = 0;
	        }
	        else {
	            rezult[i] = 1;
	        }
	    }
	    return rezult;
	}
	public static int[] pre_C_P(int[] XOR_EP) {
        int[] p = { 6, 3, 4, 1 };
        return CP(XOR_EP, p, 4);

    }

    public static int[] CP(int[] input, int[] permutationTable, int newsize) {
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
    

    public static int[] E_p8(int[] input) { 
        int [] p = {3, 0, 1, 2, 1, 2, 3, 0}; 
        return E_P(input, p, 8);
    }


    public static int[] E_P(int[] input, int[] permutationTable, int newsize) { 
        int[] result = new int[newsize];
        for (int i = 0; i < newsize; i++) {
            result[i] = input[permutationTable[i]];
        }
        return result;
    }
    public static int[] ip(int[] input) { 
        int [] p = {1, 5, 2, 0, 3, 7,4,6};

        return permute(input ,p,8);
    }
    public static int[] ip_1(int[] input) { 
        int [] p = {3, 0, 2, 4, 6, 1,7,5};

        return permute(input ,p,8);
    }
    
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
		int c=ConvertRows(col);
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
		int c2=ConvertRows(col2);
		String cc=s1[r2][c2];
		return cc;
	}
	
	public static int[] decryption(int[] input, int[] key,int[] key2) {
		
		int[] p8key = ip(input);
		int ipleft[] = new int[4];
	    int ipright[] = new int[4];
	    
	    for (int i = 0; i < 4; i++) {
	    	
	        ipleft[i] = p8key[i];
	    }
	    for (int i = 0; i < 4; i++) {
	    	
	        ipright[i] = p8key[i + 4];
	     }
	    int[] EP = E_p8(ipright);
	    int XOR_EP[] = S_DES_XOR(EP, key2);
	    int [] first =new int [4];
		int [] second =new int [4];
		int count=0;
		
		for(int i=0;i<XOR_EP.length;i++) {
			if(i<4) {
				first[i]=XOR_EP[i];
			}else {
				second[count]=XOR_EP[i];
				count++;
			}
		}
		String f;
		String f1=So(first);
		String f2=S1(second);
		f=f1+f2;
		int [] sos1= new int[4];
		for(int i=0;i<f.length();i++) {
			char ch=f.charAt(i);
			int a= ch-'0';
			sos1[i]=a;
					
		}
		
		int [] p4arr=p4(sos1);
		int [] f1xor=S_DES_XOR(p4arr,ipleft);
		int []cipher2= new int[8];
		for(int i=0,j=0;i<cipher2.length;i++) {
			if(i<4) {
				cipher2[i]=ipright[i];
			}else {
				cipher2[i] = f1xor[j];
				j++;
			}
		}
		int epleft[] = new int[4];
        int epright[] = new int[4];
        for (int i = 0; i < 4; i++) {
            epleft[i] = cipher2[i];
        }
        for (int i = 0; i < 4; i++) {
            epright[i] = cipher2[i + 4];
        }
        int[] EP2 = E_p8(epright);
        int XOR_EP2[] = S_DES_XOR(EP2, key);
        int [] funct2first =new int [4];
		int [] funct2second =new int [4];
		int count2=0;
		System.out.println("\n");
		for(int i=0;i<XOR_EP2.length;i++) {
			if(i<4) {
				funct2first[i]=XOR_EP2[i];
			}else {
				funct2second[count2]=XOR_EP2[i];
				count2++;
			}
		}
		System.out.println("\n");
		for(int i=0;i<XOR_EP2.length;i++) {
			System.out.print(XOR_EP2[i]+"ep");
		}
		System.out.println("\n");
		for(int i=0;i<funct2second.length;i++) {
			System.out.print(funct2second[i]+"second");
		}
		String forf2;
		String q1=So(funct2first);
		String q2=S1(funct2second);
		forf2=q1+q2;
		System.out.println("sososososo"+forf2);
		int [] forf2sos1= new int[4];
		for(int i=0;i<forf2.length();i++) {
			char ch=forf2.charAt(i);
			int a= ch-'0';
			forf2sos1[i]=a;
					
		}
		
		System.out.println("pppp");
		int [] p4arr2=p4(forf2sos1);
		for(int i=0;i<p4arr2.length;i++) {
			System.out.print(p4arr2[i]+"oooo");
		}
		int [] f2xor=S_DES_XOR(p4arr2,epleft);
		System.out.println();
		for(int i=0;i<f2xor.length;i++) {
			System.out.print(f2xor[i]+"p");
		}
		int []cipher= new int[8];
		for(int i=0,j=0;i<cipher.length;i++) {
			if(i<4) {
				cipher[i]=f2xor[i];
			}else {
				cipher[i] = epright[j];
				j++;
			}
		}
		return  ip_1(cipher);
	        
	}
	

}//class
