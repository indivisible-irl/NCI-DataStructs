package t02_Vectors;

public class TestVector {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myVector fruit = new myVector();
		
		fruit.disp();
		
		fruit.add("apple");
		fruit.add("orange");
		fruit.add("banana");
		fruit.add("pear");
		fruit.add("grape");
		
		System.out.println("Fruit is " + fruit.getSize() + " long");
		
		fruit.disp();
		
		fruit.sort();
		fruit.disp();
	}
	
}
