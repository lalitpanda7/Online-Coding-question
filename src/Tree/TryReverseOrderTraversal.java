package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TryReverseOrderTraversal {
class Node{
    int data;
    Node left,right;
    Node(int data){
	this.data=data;
	left=right=null;
    }
}
Node root;
public void reverseOrderTraversal() {
    Queue<Node> queue=new LinkedList<>();
    queue.add(root);
    Stack<Node> stack =new Stack<>();
    while(!queue.isEmpty()) {
	Node tempNode=queue.poll();
	stack.push(tempNode);
	if(tempNode.right!=null)
	    queue.add(tempNode.right);
	if(tempNode.left!=null)
	    queue.add(tempNode.left);
    }
    while(!stack.isEmpty())
	System.out.print(stack.pop().data+" ");
}
}
