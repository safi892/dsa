package aa;

public class roman {

	public static void main(String[] args) {
		
		
		String s = "MCMXCIV";
		int ans=0;
		for (int i=0;i<s.length();i++){
			
            
	        char ch =s.charAt(i);
	        if(ch=='I')
	        	ans=ans+1;
            else if(ch=='V')
	           	ans=ans+5;
             else if(ch=='X')
	            	ans=ans+10;
             else if(ch=='L')
	            	ans=ans+50;
             else if(ch=='C')
	            	ans=ans+100;
             else if(ch=='D')
	            	ans=ans+500;
             else if(ch=='M')
	            	ans=ans+1000;
            
	        }
		System.out.println(ans);
	}

}
