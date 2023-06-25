package in.stacks;

import java.util.Arrays;
import java.util.Stack;

public class Question1 {

	public static int[] findnextLargestElement(int[] nums) {
		int[] result=new int[nums.length];
		
		Arrays.fill(result, -1);
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=nums.length-1;i>=0;i--) {
			
			while(!stack.isEmpty() && stack.peek()<=nums[i])
				stack.pop();
			if(!stack.isEmpty())
			    result[i]=stack.peek();
			
			stack.push(nums[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		 int[] arr = {4, 5, 2, 25, 7, 18};
	     int[] nextGreater = findnextLargestElement(arr);
	     for(int res:nextGreater)
	    	 System.out.print(res+" ");

	}

}
