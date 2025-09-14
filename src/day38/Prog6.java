package day38;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		//or
		//Creation of Map
		Map<Integer, String> ht = new TreeMap<Integer, String>();
		System.out.println(ht.size());//0

		//Addition of elements into the Map
		ht.put(100, "Student1");
		ht.put(101, "Student2");
		ht.put(102, "Student3");
		ht.put(103, "Student4");
		ht.put(104, "Student5");
		ht.put(105, "Student6");
		ht.put(106, "106");
		ht.put(107, "Student8");
		ht.put(108, "Student9");
		ht.put(107, "Student8");
		ht.put(108, "Student10");
		System.out.println(ht.size());//9
		
		//Retrieval of elements from the Map (Key and values)
		//Retrieval of keys
		Set<Integer> keys = ht.keySet(); //Set - no duplicates
		for(Integer key : keys) {
			//System.out.println(key);
		}
		
		//Retrieval of values
		Collection<String> values = ht.values();
		for(String value : values) {
			//System.out.println(value);
		}
		
		//Retrieval of key and values
		for(Integer key : keys) {
			//System.out.println("Key is "+key+" value is "+ht.get(key));
		}
		
		
		
		//Retrieval of key and values
		Set<Entry<Integer,String>> entries =  ht.entrySet();
		for(Entry<Integer,String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
		//	System.out.println("Key is "+key+" value is "+value);
		}
		
		System.out.println(ht.get(104));
		System.out.println(ht.get(108)); 
		
		//4. Deletion of elements from the Map
		ht.remove(108);
		System.out.println(ht);
		
		ht.remove(106, "106");
		System.out.println(ht);
		
		//Verification of elements from the Map (Key and values)
		System.out.println(ht.containsKey(103)); //true
		System.out.println(ht.containsValue("Student15")); //false
		
		//6. Updating of elements in the Map
		ht.put(106, "Student9");
		System.out.println(ht);
		
		ht.replace(106, "Student10");
		System.out.println(ht);
		//Inserts the key only if the key does not exists in the whole table
		ht.putIfAbsent(107, "Student11");
		System.out.println(ht);
		
		ht.clear();
        System.out.println(ht);	
	}

}
