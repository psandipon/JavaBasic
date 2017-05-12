package recursion;

public class fibonacciRecursion {

	public static void main(String[] args) {
		//fibonacciIteratively(20);
		System.out.println(fibonacciRe(10));
	}

	private static int fibonacciRe(int num) {
		if (num == 1 || num == 2) {
			int a = 1 ;
			System.out.println(a);
			return a;
		}
		int a = fibonacciRe(num - 1) + fibonacciRe(num - 2) ;
		System.out.println(a);
		return a;
	}

}
