package binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrder_Queue_Based {
	
	static Node<Integer> buildTree(int[] a) {
		// 2,3,4,-1,9,-1,7
		if(a.length==0 || a[0]==-1)
			return null;
		
		Node<Integer> root = new Node<Integer>(a[0]);
		Queue<Node<Integer>> queue = new LinkedList<Node<Integer>>();
		queue.add(root);
		int index=1;
		
		while(!queue.isEmpty()) {
			Node<Integer> cur = queue.poll();
			if(index<a.length && a[index]!=-1) {
				cur.prev = new Node<Integer>(a[index]);
				queue.add(cur.prev);
			}
			index++;
			if(index<a.length && a[index]!=-1) {
				cur.next = new Node<Integer>(a[index]);
				queue.add(cur.next);
			}
			index++;
		}
		return root;
	}
	
	private static void preOrderIterativeTraversal(Node<Integer> root) {
		
		if(root == null)
			System.out.println("Tree is null");
		else {
			Stack<Node<Integer>> stack = new Stack<>();
			stack.push(root);
			while(!stack.isEmpty()) {
				System.out.print(stack.peek().data+" ");
				Node<Integer> temp = stack.pop();
				if (temp.next != null) 
					stack.push(temp.next);
				if (temp.prev != null) 
					stack.push(temp.prev);
				
			}
		}
	}
	
	private static void inOrderIterativeTraversal(Node<Integer> root) {
		Node<Integer> cur = root;
		Stack<Node<Integer>> st = new Stack<>();
		System.out.println();
		while(cur != null || !st.isEmpty()) {
			while(cur != null) {
				st.push(cur);
				cur = cur.prev;
			}
			cur = st.pop();
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
	}

	private static void postOrderIterativeTraversal(Node<Integer> root) {
		Stack<Node<Integer>> st1 = new Stack<>();
		Stack<Node<Integer>> st2= new Stack<>();
		st1.push(root);
		
		while(!st1.isEmpty()) {
			Node<Integer> cur = st1.pop();
			st2.push(cur);
			if(cur.prev != null)
				st1.push(cur.prev);
			if(cur.next != null)
				st1.push(cur.next);
		}
		System.out.println();
		while(!st2.isEmpty())
			System.out.print(st2.pop().data+ " ");
	}

	
	public static void main(String[] args) {
		
		int[] a = new int[] {2,3,4,-1,9,8,7};
		Node<Integer> root = buildTree(a);
		preOrderIterativeTraversal(root);
		inOrderIterativeTraversal(root);
		postOrderIterativeTraversal(root);
	}

}
