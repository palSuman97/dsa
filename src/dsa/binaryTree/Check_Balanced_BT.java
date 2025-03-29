package dsa.binaryTree;

public class Check_Balanced_BT {

	public static void main(String[] args) {
		
		int[] a = new int[] {2,3,4,-1,9,8,7,8};
		Node<Integer> root = LevelOrder_Queue_Based.buildTree(a);
		
		System.out.println(checkBalanceBT(root));
		
	}
	
	private static boolean checkBalanceBT(Node<Integer> root) {
		return heightRecursive(root) != -1;
	}

	private static int heightRecursive(Node<Integer> cur) {
		
		if(cur == null)
			return 0;
		int heightleft = heightRecursive(cur.prev);
		if(heightleft == -1) return -1;
		int heightRight = heightRecursive(cur.next);
		if(heightRight == -1 ) return -1;
		if(Math.abs(heightleft-heightRight)>1) return -1;
		return 1+ (heightleft>heightRight? heightleft : heightRight);
	}
	
}
