package in.stacks;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	
	Queue<Integer> q1=new LinkedList<Integer>();
	Queue<Integer> q2=new LinkedList<Integer>();
	
	public MyStack() {
	}
	
	void push(Integer num) {
		q1.add(num);
	}
	
	int top() {
		
		while(q1.size()>1) {
			q2.add(q1.remove());
		}
		Integer last = q1.peek();
		q2.add(q1.remove());
		
		while(q2.size()>0) {
			q1.add(q2.remove());
		}
		return last;
	}
	
	int pop() {
		while(q1.size()>1) {
			q2.add(q1.remove());
		}
		Integer last = q1.remove();
		
		while(q2.size()>0) {
			q1.add(q2.remove());
		}
		return last;
	}
	
	boolean isEmpty() {
		if(q1.size()==0)
			return true;
		else
			return false;
	}
	

}
