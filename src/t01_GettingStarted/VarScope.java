package t01_GettingStarted;

public class VarScope {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x=12, y=5;
		
		System.out.println("Ïnitially:\n\tx is " +x+ "\n\ty is " +y);
		
		for (int i=2; i<5; i+=3){
			System.out.println("for loop x is "+(x+1)+"and y is "+(y-1));
			System.out.println("i is "+i);
		}
		System.out.println("After for x is "+x+" and y is "+y);
		
		if (x>0){
			x = 33;
			//String aWord= "Hello";
			y++;
			System.out.println("if block x is "+x+" and y is "+y+"\n");
		} //if

	}

}
