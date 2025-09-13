package day38;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		//or
		//Creation of Map
		Map<Integer, String> ht = new Hashtable<Integer, String>();
		System.out.println(ht.size());//0

		//Addition of elements into the Map
		ht.put(100, "Student1");
		ht.put(101, "Student2");
		ht.put(102, "Student3");
		ht.put(103, "Student4");
		ht.put(104, "Student5");
		ht.put(105, "Student6");
		ht.put(106, "Student6");
		ht.put(107, "Student8");
		ht.put(108, "Student9");
		ht.put(107, "Student8");
		ht.put(108, "Student9");
		System.out.println(ht.size());//9
		
		//Retrieval of elements from the Map (Key and values)
		//Retrieval of keys
		Set<Integer> keys = ht.keySet();
		for(Integer key : keys) {
			System.out.println(key);
		}
		
		//Retrieval of values
		Collection<String> values = ht.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		//Retrieval of key and values
		for(Integer key : keys) {
			System.out.println("Key is "+key+" value is "+ht.get(key));
		}
		
		System.out.println(ht.get(104));
	}

}
