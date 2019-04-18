package Treetest;

import java.util.Stack;

public class Count_BST_nodes_that_lie_in_a_given_range {
    
    public static int getCountOfNode(Node root,int l, int h)
    {
       Node  current=root;
       int count=0;
       Stack<Node> stack =new Stack<>();
       while(!(current==null && stack.isEmpty())) {
       stack.push(current);
       current=current.left;
       Node tempNode=stack.pop();
       current=tempNode.right;
       if(tempNode.data>=l||tempNode.data<=h)
	   count++;
       }
       return count;
    }
}
