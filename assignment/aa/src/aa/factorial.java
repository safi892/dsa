package aa;
import java.math.BigInteger;
import java.util.Scanner;
public class factorial {
	

		static BigInteger factorial(int N)
		{
			BigInteger f= new BigInteger("1");

			for (int i = 2; i <= N; i++)
				f = f.multiply(BigInteger.valueOf(i));

			return f;
		}

		public static void main(String args[]) throws Exception
		{
			int N = 100;
			System.out.println(factorial(N));
		}
	


}
