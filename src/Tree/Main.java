package Tree;

 // Java program to find maximum sum leaf to root
// path in Binary Tree
import java.util.HashMap;
import java.util.Scanner;

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
public class Main
 {
     // driver function to test the above functions
     public static void main(String args[])
     {
         // Input the number of test cases you want to run
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while (t > 0)
         {
             HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
             int n = sc.nextInt();
             Node root = null;
             while (n > 0)
             {
        	
      int n1 = sc.nextInt();
                 int n2 = sc.nextInt();
                 char lr = sc.next().charAt(0);
                 
                 //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                 Node parent = m.get(n1);
                 if (parent == null)
                 {
                     parent = new Node(n1);
                     m.put(n1, parent);
                     if (root == null)
                         root = parent;
                 }
                 Node child = new Node(n2);
                 if (lr == 'L')
                     parent.left = child;
                 else
                     parent.right = child;
                 m.put(n2, child);
                 n--;
             }
             GfG g = new GfG();
             g.inOrder(root);
             System.out.print(" ");
             t--;
         }
     }
 }
 

 /*Please note that it's Function problem i.e.
 you need to write your solution in the form of Function(s) only.
 Driver Code to call/invoke your function is mentioned above.*/

 /* A Binary Tree node
 class Node {
     int data;
     Node left, right;
    Node(int item)    {
         data = item;
         left = right = null;
     }
 } */
 class GfG
 {
     void inOrder(Node root)
     {
        if(root==null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
        
        }
        
     
 }