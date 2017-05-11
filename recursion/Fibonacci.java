package recursion;

public class Fibonacci {

	public static void main(String[] args){
		fibonacciIteratively(20);
	}

	private static void fibonacciIteratively(int num) {
		int last1 = 0 ;
		int last2 = 1 ;
		int last3 = last1+last2 ;
		System.out.println(last1);
		System.out.println(last2);
		for (int i = 0; i < num; i++) {
			last3 = last1+last2 ;
			System.out.println(last3);
			last1=last2 ;
			last2 = last3 ;
		}
	}

}
