package Treetest;

 import java.util.Scanner;
 import java.util.LinkedList;
 import java.util.Queue;
 import java.util.Stack;

import test1.*;

import java.util.HashMap;
 import java.util.*;
import java.io.*;
import java.lang.Character;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;
 class Node1
 {
     int data;
     Node1 left, right;
     Node1(int item)
     {
         data = item;
         left = right = null;
     }
 }
 public class Level_Order_Traversal
 {
 	
 	
     // driver function to test the above functions
     public static void main(String args[])
     {
 		
         // Input the number of test cases you want to run
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
 		//Node root=null;
         while (t > 0)
         {
             HashMap<Integer, Node1> m = new HashMap<Integer, Node1> ();
             int n = sc.nextInt();
             Node1 root=null;
             while (n > 0)
             {
                 int n1 = sc.nextInt();
                 int n2 = sc.nextInt();
                 char lr = sc.next().charAt(0);
                 Node1 parent = m.get(n1);
                 if (parent == null)
                 {
                     parent = new Node1(n1);
                     m.put(n1, parent);
                     if (root == null)
                         root = parent;
                 }
                 Node1 child = new Node1(n2);
                 if (lr == 'L')
                     parent.left = child;
                 else
                     parent.right = child;
                 m.put(n2, child);
                 n--;
             }
 		
             GfG g = new GfG();
             g.printSpiral(root);
 			System.out.println();
             t--;
 			
         }
     }
 }

 /*Please note that it's Function problem i.e.
 you need to write your solution in the form of Function(s) only.
 Driver Code to call/invoke your function is mentioned above.*/

 /*
 // A Binary Tree node
 class Node
 {
     int data;
     Node left, right;
     Node(int item)
     {
         data = item;
         left = right = null;
     }
 }
 */
 class GfG
 {
       void printSpiral(Node1 root) 
       {
     Queue<Node1> queue = new LinkedList<>();
     Queue<Character> levelCheck =new LinkedList<>();
     List<Integer> levels =new LinkedList<>();
     queue.add(root);
     int count=1;
     levelCheck.add('$');
     levels.add(count++);
     List<Integer> list=new LinkedList<>();
     while(!queue.isEmpty()) {
 	Node1 tempNode=queue.poll();
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
 	    if(i==list.size()-1 || levels.get(i+1)%2==0)
 		while(!reverse.isEmpty())
 		    System.out.print(reverse.pop()+" ");
 	}
     }
 }
 }
