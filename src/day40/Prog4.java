package day40;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Creation of Queue
		ArrayDeque<Integer> pq = new ArrayDeque<Integer>();
		
		//2. Addition of elements into the Queue
		pq.add(2);
		pq.add(22);
		pq.add(1);
		pq.add(5);
		pq.offer(55);
		pq.addFirst(10);
		pq.addLast(100);
		pq.offerFirst(22);
		pq.offerLast(85);
		
		System.out.println(pq);
		
		//3. Retrieval of elements from the Queue
		System.out.println(pq.peek());
		System.out.println(pq.peekFirst());
		System.out.println(pq.peekLast());

		
		//4. Deletion of elements from the Queue
		pq.poll();
		System.out.println(pq);
		pq.pollFirst();
		System.out.println(pq);
		pq.pollLast();
		System.out.println(pq);
		//pq.remove();
		//System.out.println(pq);

		//5. Verification of elements from the Queue
		System.out.println(pq.contains(82));
	}
}
