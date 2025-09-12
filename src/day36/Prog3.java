package day36;

import java.util.ArrayList;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Bengaluru");
		al.add("Pune");
		al.add("Mumbai");
		
		System.out.println(al); //[Bengaluru,Pune,Mumbai]
		al.remove(0); //index
		
		System.out.println(al);//[Pune,Mumbai]
		al.remove("Pune"); //object
		
		System.out.println(al);//[Mumbai]
		al.removeAll(al);
		
		System.out.println(al);//[]
		
	}

}
