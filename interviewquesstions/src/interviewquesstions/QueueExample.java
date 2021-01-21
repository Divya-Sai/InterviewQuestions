package interviewquesstions;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Object> p1 = new PriorityQueue<>();
		PriorityBlockingQueue<Object> p2 = new PriorityBlockingQueue<>();
		LinkedBlockingQueue<Object> p3 = new LinkedBlockingQueue<>();

		/*
		 * Queue<Object> p1 = new PriorityQueue<>(); BlockingQueue<Object> p2 = new
		 * PriorityBlockingQueue<>(); BlockingQueue<Object> p3 = new
		 * LinkedBlockingQueue<>();
		 */

		//PriorityQueue,PriorityBlockingQueue and 
		//- Inertion order is not preserved and duplicates are aloowed
		System.out.println("============PriorityQueue===============");

		p1.add("queue");
		p1.add("Print");
		p1.add("Screen");
		p1.add("queue");

		System.out.println("PriorityQueue :"+p1);

		System.out.println("============PriorityBlockingQueue===============");

		p2.add("Delete");
		p2.add("Add");
		p2.add("Subtract");
		p2.add("Delete");

		System.out.println("PriorityBlockingQueue :"+p2);
		
		//LinkedBlockingQueue - Insertion order is preserved and duplicates are allowed
		System.out.println("============LinkedBlockingQueue===============");

		p3.add("Check");
		p3.add("Check-Out");
		p3.add("Due");
		p3.add("Due");

		System.out.println("LinkedBlockingQueue :"+p3);

	}

}
