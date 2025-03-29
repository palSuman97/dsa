package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Height_of_BT {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,4,5,-1,9,-1,7,-1,11,8,-1,10};
		Node<Integer> root = LevelOrder_Queue_Based.buildTree(a);
		
		System.out.println(heightRecursive(root));
		System.out.println(heightIterative(root));

	}

	private static int heightIterative(Node<Integer> cur) {
		
		Queue<Node<Integer>> queue = new LinkedList<Node<Integer>>();
		queue.add(cur);
		int height = -1;
		while(!queue.isEmpty()) {
			height++;
			int queueSize = queue.size();
			for(int i=0;i<queueSize;i++) {
				Node<Integer> temp = queue.remove();
				if(temp.prev != null)
					queue.add(temp.prev);
				if(temp.next != null)
					queue.add(temp.next);
			}
		}
		return height;
	}

	private static int heightRecursive(Node<Integer> cur) {
		
		if(cur == null)
			return -1;
		int heightleft = heightRecursive(cur.prev);
		int heightRight = heightRecursive(cur.next);
		
		return 1+ (heightleft>heightRight? heightleft : heightRight);
	}

}
