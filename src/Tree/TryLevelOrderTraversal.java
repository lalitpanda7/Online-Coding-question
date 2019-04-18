package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node2 {
	int value;
	Node2 left, right;

	public Node2(int value) {
	    this.value = value;
	    left = right = null;
	}
}

public class TryLevelOrderTraversal {

     Node2 root;
    
    void printLevelOrder(){
	Queue<Node2> queue = new LinkedList<>();
	queue.add(root);
	Queue<Character> levelCheck=new LinkedList<>();
	levelCheck.add('$');
	while(!queue.isEmpty()) {
	    Node2 tempNode=queue.poll();
	    System.out.println(tempNode.value);
	    if(tempNode.left!=null) {
		queue.add(tempNode.left);
		levelCheck.add('@');
		}
	    if(tempNode.right!=null) {
		queue.add(tempNode.right);
		levelCheck.add('@');
		}
	    char ch=levelCheck.poll();
	    if(ch=='$') {
		System.out.print("$ ");
		if(!levelCheck.isEmpty())
		    levelCheck.poll();
		levelCheck.add('$');
	    }
	}
	
    }

    public TryLevelOrderTraversal() {
	root=null;
    }

    public static void main(String[] args) {
	/*
	 * creating a binary tree and entering the nodes
	 */
	TryLevelOrderTraversal tree_level = new TryLevelOrderTraversal();
	tree_level.root = new Node2(1);
	tree_level.root.left = new Node2(2);
	tree_level.root.right = new Node2(3);
	tree_level.root.left.left = new Node2(4);
	tree_level.root.left.right = new Node2(5);

	System.out.println("Level order traversal of binary tree is - ");
	tree_level.printLevelOrder();
    }

}
