package t11_Recursion;

public class Fib {

	public static void main(String[] args) {
		doFib(10);
		//System.out.println(fib(Integer.MAX_VALUE));
	}
	
	public static int fib(int n){
		int fib;
		if (n < 0){
			System.out.println("\n\n!! Errored on: " +n);
			throw new IndexOutOfBoundsException("You have gone outside the bounds of the Integer object.");
		} else if ((n == 1 || (n == 2))){
			fib = 1;
		} else {
			fib = fib(n - 1) + fib(n - 2);
		}
		return fib;
	}

	public static void doFib(int fibEnd){
		System.out.println("Fibonaccci sequence for " +fibEnd+ " elements");
		System.out.print("[ ");
		for (int i = 1; i <= fibEnd; i++) {
			System.out.print(fib(i));
			if (i != fibEnd)
				System.out.print(", ");
		}
		System.out.print(" ]");
//		return sb.toString();
	}
}
