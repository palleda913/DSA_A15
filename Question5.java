package in.stacks;

import java.util.Stack;

public class Question5 {

	

	public static void main(String[] args) {
		String s="geeksforgeeks";
		System.out.println(reverseString(s));

	}

	private static String reverseString(String s) {
		String res="";
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			st.push(s.charAt(i));
		}
		while(!st.isEmpty()) {
			Character pop = st.pop();
			res+=(pop);
		}
		
		return res;
	}

}
