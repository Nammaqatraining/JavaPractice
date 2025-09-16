package day40;

import java.util.PriorityQueue;

public class Prog1 {

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
		
		//3. Retrieval of elements from the Queue
		System.out.println(pq.peek());

		
		//4. Deletion of elements from the Queue
		pq.poll();
		System.out.println(pq);

		//pq.remove();
		//System.out.println(pq);

		//5. Verification of elements from the Queue
		System.out.println(pq.contains(82));
	}
}
