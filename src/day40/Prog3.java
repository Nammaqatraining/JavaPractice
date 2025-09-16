package day40;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Creation of Queue
				PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
				
				//2. Addition of elements into the Queue
				pq.add(12);
				pq.add(22);
				pq.add(22);
				pq.add(10);
				pq.add(45);
				pq.offer(65);
				//pq.add(null);
				
				
				System.out.println(pq);
				
				while(!pq.isEmpty()) {
					System.out.println(pq.poll());
				}
	}

}
