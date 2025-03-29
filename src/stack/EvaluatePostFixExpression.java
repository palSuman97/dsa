package stack;

import java.util.Stack;

public class EvaluatePostFixExpression {

	public static void main(String[] args) {
		
		String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<tokens.length;i++) {
			switch (tokens[i]) {
				case "*" -> {
						int op2 = stack.pop();
						int op1 = stack.pop();
						stack.push(op1*op2);
					}
				case "/" -> {
						int op2 = stack.pop();
						int op1 = stack.pop();
						stack.push(op1/op2);
					}
				case "+" -> {
						int op2 = stack.pop();
						int op1 = stack.pop();
						stack.push(op1+op2);
					}
				case "-" -> {
						int op2 = stack.pop();
						int op1 = stack.pop();
						stack.push(op1-op2);
					}
				
				default -> stack.push(Integer.parseInt(tokens[i]));
			}
		}
		
		System.out.println(stack.pop());
	}

}
