package day35;

import java.util.Arrays;
import java.util.Vector;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creation of vector
		Vector<String> v1 = new Vector<>(30);
		
		System.out.println(v1.size());//0
		System.out.println(v1.capacity());//10
		
		//Addition of elements into the vector
		v1.add("1");
		v1.add("2");
		v1.add("3");
		v1.add("4");
		v1.add("5");
		v1.add("6");
		v1.add("7");
		v1.add("8");
		v1.add("9");
		//v1.add(10);
		//v1.add('v');
		v1.add("11");
		
		System.out.println(v1.size());//11
		System.out.println(v1.capacity());//20
		
		//3. Retrieval of elements from the vector
		for(int i=0;i<v1.size();i++) {
			//System.out.println(v1.get(i));
		}
		
		
		//4. Deletion of elements from the vector
		v1.remove(0);
		
		System.out.println(v1.size());//10
		System.out.println(v1.capacity());//20
		
		//v1.removeAll(v1);
		System.out.println(v1.size()); //0
		System.out.println(v1.capacity());//20
		
		
		Vector v2 = new Vector();
		v2.add("1");
		v2.add("2");
		//6. Updating of elements in the vector
		v1.addAll(v2);
		
		System.out.println(v1);
		//5. Verification of elements from the vector
		System.out.println(v1.containsAll(v2));//true
		
		System.out.println(v1.contains("20"));//false
		
		
		System.out.println(v1.indexOf("7"));//5
		System.out.println(v1.firstElement());//2
		
		System.out.println(v1.lastElement());//2
		System.out.println(v1.removeFirst());//2
		System.out.println(v1.removeLast());//2
		
		System.out.println(v1.size()); //10
		System.out.println(v1.capacity());//20
		
		
		System.out.println(v1);
		
		Object arr[] = v1.toArray();
		System.out.println(Arrays.toString(arr));
	}

}
