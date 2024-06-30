package aa;

import java.lang.annotation.Target;
import java.util.*;

public class tw0Sum {
    public static void main(String[] args) {

//        int[] arr = { 11, 3, 7, 9, 14, 2 };
//        int target = 17;
//        int[] ans = new int[2];
//        //         solution 1
//        // for (int i = 0; i < arr.length; i++) {
//        //     for(int j=i+1;j<arr.length;j++){
//        //         if(arr[i] + arr[j] == target){
//        //             ans[0]=arr[i];
//        //             ans[1]=arr[j];
//        //         }
//        //     }
//        // }
//        // System.err.println(ans[0] +"  "+ ans[1]);
//
//        HashMap<Integer,Integer> map=new HashMap<>(); 
//        for(int i = 0; i < arr.length; i++){
//            int sno =target-arr[i];
//            if(map.containsKey(sno)){
//                ans[0] = sno;
//                ans[1] = arr[i];
//                break;
//            }
//            map.put(arr[i], i);
//        }
//        System.err.println(ans[0] +"  "+ ans[1]);
    	
    	
    	
    	Stack<Integer> st = new Stack<>();
    	int [] nums = {1,2,3,4,5,6,7};
    	int k = 3;
    	int n=nums.length;
    	if(n%2!=0) {
    		k=k+1;
    	}else {
    		k=k;
    	}
    	
    	for (int i=0;i<nums.length;i++) {
    		if(i<k)
    			st.push(nums[i]);
    		int t=(i+(k))%nums.length;
    		nums[i]=nums[t];
    	}
    	for (int i=nums.length-1;i>0;i--) {
    		if(k>0) {
    			int temp=st.pop();
        		nums[i]=temp;
        		k--;
    		}
    		
    	}
    	
    	for(int i=0;i<nums.length;i++) {
    		System.out.println("  "+nums[i]);
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//[-1,-100,3,99]
    			
    
//    	int [] nums = {-1,-100,3,99};
//    	int k = 2;
//    	Stack<Integer> st = new Stack<>();
//    	String s="";
//    	int n=nums.length;
//    	for (int i=0;i<nums.length;i++) {
//    		if(i<(k)) {
//    			st.push(nums[i]);
//    		}
//    			
//    		int t=(i+(k))%nums.length;
//    		nums[i]=nums[t];
//    	}
//    	for (int i=nums.length-1;i>=0;i--) {
//    		if(k>0) {
//    			int temp=st.pop();
//        		nums[i]=temp;
//        		k--;
//    		}
//    	}
//    	for(int i=0;i<nums.length;i++) {
//    		System.out.println("  "+nums[i]);
//    	}
    	
    	
    	public void rotate(int[] nums, int k) {

            int n = nums.length;
            k = k % n;

            if(k == 0)
                return;

            int count = nums.length - k;

            ArrayList<Integer> list = new ArrayList<>();

            for(int i=count;i<nums.length;i++) {
                list.add(nums[i]);
            }

            for(int i=0;i<count;i++) {
                list.add(nums[i]);
            }

            for(int i=0;i<list.size();i++) {
                nums[i] = list.get(i);
            }
        }
    }
    	
    	
    	
   