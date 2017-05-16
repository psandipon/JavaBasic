package recursion;

public class FibonacciWithMemoization {

	public static long fibonacciArray[]=new long[26]; // this array is for holding fibonacci numbers

	public static void main(String args[]){
		for (long l : fibonacciArray) {
			System.out.print(l);
		}

		System.out.println();
		fibonacciArray[0]=1;
		fibonacciArray[1]=1;

		fibonacci(25) ;

		for (long l : fibonacciArray) {
			System.out.println(l);
		}
	}

	public static long fibonacci(long n){
		long fibValue=0;
		if(n==0 ){
			return 0; // base case
		}else if(n==1){
			return 1; // base case
		}else if(fibonacciArray[(int)n]!=0){
			return fibonacciArray[(int)n]; //
		}else{
			fibValue=fibonacci(n-1)+fibonacci(n-2);
			fibonacciArray[(int) n]=fibValue; // storing values for later use
			return fibValue;
		}
	}


}