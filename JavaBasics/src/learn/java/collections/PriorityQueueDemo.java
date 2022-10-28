package learn.java.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<Integer>();

		q.offer(Integer.valueOf(1)); 
		q.offer(Integer.valueOf(2));
		q.offer(Integer.valueOf(3));
		
		System.out.println(q.peek());
		System.out.println(q.remove()); // throws exception if no element present
		System.out.println(q.poll()); // returns null if no element present
		
		

	}

}
