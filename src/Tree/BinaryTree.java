package Tree;

// Iterative Queue based Java program to do level order traversal 
// of Binary Tree 

/* importing the inbuilt java classes required for the program */
import java.util.Queue; 
import java.util.LinkedList; 

/* Class to represent Tree node */
class Node1 { 
	int data; 
	Node1 left, right; 

	public Node1(int item) { 
		data = item; 
		left = null; 
		right = null; 
	} 
} 

/* Class to print Level Order Traversal */
class BinaryTree { 

	Node1 root; 

	/* Given a binary tree. Print its nodes in level order 
	using array for implementing queue */
	void printLevelOrder() 
	{ 
		Queue<Node1> queue = new LinkedList<Node1>(); 
		queue.add(root); 
		while (!queue.isEmpty()) 
		{ 

			/* poll() removes the present head. 
			For more information on poll() visit 
			http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
			Node1 tempNode = queue.poll(); 
			System.out.print(tempNode.data + " "); 

			/*Enqueue left child */
			if (tempNode.left != null) { 
				queue.add(tempNode.left); 
			} 

			/*Enqueue right child */
			if (tempNode.right != null) { 
				queue.add(tempNode.right); 
			} 
		} 
	} 

	public static void main(String args[]) 
	{ 
		/* creating a binary tree and entering 
		the nodes */
		BinaryTree tree_level = new BinaryTree(); 
		tree_level.root = new Node1(1); 
		tree_level.root.left = new Node1(2); 
		tree_level.root.right = new Node1(3); 
		tree_level.root.left.left = new Node1(4); 
		tree_level.root.left.right = new Node1(5); 

		System.out.println("Level order traversal of binary tree is - "); 
		tree_level.printLevelOrder(); 
	} 
} 
