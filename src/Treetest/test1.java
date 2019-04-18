package Treetest;

/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
public class test1 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases-->0)
		{
		    Node root=null;
		    int sizeOfArray=sc.nextInt();
		    int arr[]=new int[sizeOfArray];
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        int x=sc.nextInt();
		        arr[i]=x;
		    }
		   
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        root=Geeks.newNode(root,arr[i]);
		    }
		    int l,h;
		    l=sc.nextInt();
		    h=sc.nextInt();
		    System.out.println(Geeks.getCountOfNode(root,l,h));
		
		}
	}
}
class Node
{
    int data;
    Node left;
    Node right;
}
class Geeks
{
    public static Node createNewNode(int value)
    {
        Node temp=new Node();
        temp.data=value;
        temp.left=null;
        temp.right=null;
        return temp;
    }
    static public Node newNode(Node root,int data)
    {
        if(root==null)
        root=createNewNode(data);
        else if(data<root.data)
        root.left=newNode(root.left,data);
        else
        root.right=newNode(root.right,data);
        
        return root;
    }
  
    //Position this line where user code will be pasted.
    public static int getCountOfNode(Node root,int l, int h)
    {
           Node  current=root;
           int count=0;
           Stack<Node> stack =new Stack<>();
           while(current!= null || stack.size() > 0) {
               while (current !=  null) 
               { 
                   stack.push(current); 
                   current = current.left; 
               } 
           Node tempNode=stack.pop();
           current=tempNode.right;
           if(tempNode.data>=l && tempNode.data<=h)
    	   count++;
           }
           return count;
        }    
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

// A Binary Search Tree node
/*
Structure of node
class Node
{
    int data;
    Node left;
    Node right;
}
*/
//Complete this function
