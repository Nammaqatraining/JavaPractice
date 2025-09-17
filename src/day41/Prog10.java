package day41;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class Prog10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<Integer, String>();

		//Addition of elements into the linked list
		//System.out.println(li.size());//0
		map.put(100, "ABC");
		map.put(101, "CDE");
		map.put(102, "EFG");
		
		
		for(Map.Entry m : map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
