package day40;

import java.util.PriorityQueue;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Creation of Queue
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		//2. Addition of elements into the Queue
		pq.add(2);
		pq.add(22);
		pq.add(1);
		pq.add(5);
		pq.offer(55);
		
		System.out.println(pq);
		
		
		//Dont use for each loop
		for(Integer pq1:pq) {
			System.out.println(pq1);
		}

		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
