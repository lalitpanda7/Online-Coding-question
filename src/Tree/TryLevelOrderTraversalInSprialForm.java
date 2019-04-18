package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Node3{
	int data;
	Node3 left,right;
	Node3(int data){
	    this.data=data;
	    left=right=null;
	}
}
public class TryLevelOrderTraversalInSprialForm {    
Node3 root;
public void levelOrderTraversalInSprialForm() {
    Queue<Node3> queue = new LinkedList<>();
    Queue<Character> levelCheck =new LinkedList<>();
    List<Integer> levels =new LinkedList<>();
    queue.add(root);
    int count=1;
    levelCheck.add('$');
    levels.add(count++);
    List<Integer> list=new LinkedList<>();
    while(!queue.isEmpty()) {
	Node3 tempNode=queue.poll();
	list.add(tempNode.data);
	if(tempNode.left!=null) {
	    queue.add(tempNode.left);
	    levelCheck.add('@');
	    levels.add(count);}
	if(tempNode.right!=null) {
	    queue.add(tempNode.right);
	    levelCheck.add('@');
	    levels.add(count);}
	Character ch = levelCheck.poll();
	if(ch=='$') {
	    levelCheck.poll();
	    levelCheck.add('$');
	    count++;
	}
    }
    Stack<Integer> reverse=new Stack<>();
    for(int i=0;i<list.size();i++) {
	if(levels.get(i)%2==0)
	    System.out.print(list.get(i)+" ");
	else {
	    reverse.push(list.get(i));
	    if(i==list.size()-1 | levels.get(i+1)%2==0)
		while(!reverse.isEmpty())
		    System.out.print(reverse.pop()+" ");
	}
    }
}
}
