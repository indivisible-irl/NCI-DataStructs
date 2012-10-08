package t11_Recursion;


public class RecursionTut {

	public static void main(String[] args) {
		// power of two
		int powerOfTwo = 4;
		System.out.println(twoToThePowerOf(powerOfTwo));
		
		// power of anything
		int num = 3;
		int powerOf = 3;
		System.out.println(power(num, powerOf));
		
		// my reverse
		String test = "cats";
		System.out.println(reverse(test));
		
		// his reverse (prints)
		System.out.println("his reverse:");
		hisReverse("cats");
		System.out.println();
		
		// palindrome
		String noPalindrome = "this ain't a palendrome";
		String yesPalindrome = "abcddcba";

		System.out.println("no is: " + isPalindrome(noPalindrome));
		System.out.println("yes is: " + isPalindrome(yesPalindrome));
	}
	
	public static int twoToThePowerOf(int n){
		int pOf;
		if (n == 1){
			pOf = 2;
		} else {
			pOf = 2 * twoToThePowerOf(n-1);
		}
		return pOf;
	}
	
	public static int power(int num, int power){
		int pOf;
		if (num == 1){
			pOf = num * power;
		} else {
			pOf = power * power((num-1), power);
		}
		return pOf;
	}
	
	public static void hisReverse(String s){
		if (s.length() > 0){
			System.out.print(s.substring(s.length()-1));
			hisReverse(s.substring(0, s.length()-1));
		}
	}
	
	public static String reverse(String msg){
		String backwards = "";
		if (msg.length() == 1){
			return msg;
		} else {
			String lastChar = msg.substring(msg.length()-1, msg.length());
			String restOfString = msg.substring(0, msg.length()-1);
			backwards = lastChar + reverse(restOfString);
			return backwards;
		}
	}
	
	public static boolean isPalindrome(String msg){
		boolean test = true;
		if (msg.length() <= 1){
			return true;
		} else {
//			System.out.println("start: " +msg.substring(0, 1) + "  | end: " + msg.substring(msg.length()-1, msg.length()));
			if (!(msg.substring(0, 1).equals(msg.substring(msg.length()-1, msg.length())))){
				return false;
			}
			test = isPalindrome(msg.substring(1, msg.length()-1));
		}
		return test;
	}
	

}
