package lect03_ArrayLists;

import java.util.ArrayList;
import java.util.List;


public class TestListAddIndex {

	public static void main(String[] args){
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(2));
		
		System.out.println(list.toString());
		
		list.add(1, new Integer(9));
		
		System.out.println(list.toString());
	}
	
}
