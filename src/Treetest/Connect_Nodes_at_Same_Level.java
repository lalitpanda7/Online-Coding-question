package Treetest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node4{
	int data;
	Node4 left,right,nextRight;
	Node4(int data){
	    this.data=data;
	    left=right=nextRight=null;
	}
}
public class Connect_Nodes_at_Same_Level {
    
    Node4 root;
    void connect(Node4 root)
    {
	Queue<Node4> queue =new LinkedList<>();
	ArrayList<Integer>level=new ArrayList<>();
	Queue<Character> levelCheck=new LinkedList<>();
	List<Node4> list=new LinkedList<>();
	levelCheck.add('$');
	int count = 0;
	queue.add(root);
	level.add(count++);
	while(!queue.isEmpty()) {
	    Node4 tempNode=queue.poll();
	    list.add(tempNode);
	    if(tempNode.left!=null) {
		level.add(count);
		levelCheck.add('@');
		queue.add(tempNode.left);}
	    if(tempNode.right!=null) {
		level.add(count);
		levelCheck.add('@');
		queue.add(tempNode.right);}
	    if(levelCheck.poll()=='$') {
		    levelCheck.poll();
		    levelCheck.add('$');
		    count++;
		}
	}
	for(int i=1;i<level.size();i++) {
	    if(level.get(i-1).equals(level.get(i)))
		list.get(i-1).nextRight=list.get(i);
	}
	
    }
}
