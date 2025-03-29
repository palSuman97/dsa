package stack;

public class StackImplUsingLL {

	public static void main(String[] args) {
		
		StackLL<Integer> stackLL = new StackLL<>();
		
		stackLL.push(1);
		stackLL.push(2);
		stackLL.getPeekData();
		stackLL.pop();
		//stackLL.pop();
		stackLL.getPeekData();

	}

}
