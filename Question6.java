package in.stacks;

import java.util.Stack;

public class Question6 {

	 public static int evaluatePostfixExpression(String S) {
	        Stack<Integer> stack = new Stack<>();

	        for (int i = 0; i < S.length(); i++) {
	            char ch = S.charAt(i);

	            if (Character.isDigit(ch)) {	                
	                stack.push(ch - '0');
	            } else {
	                int operand2 = stack.pop();
	                int operand1 = stack.pop();
	                int result = performOperation(ch, operand1, operand2);

	                // Push the result back onto the stack
	                stack.push(result);
	            }
	        }

	        return stack.pop();
	    }

	    public static int performOperation(char operator, int operand1, int operand2) {
	        int result = 0;

	        switch (operator) {
	            case '+':
	                result = operand1 + operand2;
	                break;
	            case '-':
	                result = operand1 - operand2;
	                break;
	            case '*':
	                result = operand1 * operand2;
	                break;
	            case '/':
	                result = operand1 / operand2;
	                break;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        String postfixExpression = "231*+9-";
	        int result = evaluatePostfixExpression(postfixExpression);

	        System.out.println("Postfix Expression: " + postfixExpression);
	        System.out.println("Result: " + result);
	    }
}
