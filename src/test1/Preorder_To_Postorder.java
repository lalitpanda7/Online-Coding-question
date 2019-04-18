package test1;

import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Preorder_To_Postorder {
    static class INT 
    { 
        int data; 
        INT(int d) 
        { 
            data=d; 
        } 
    } 
          
    // Function to find postorder traversal from  
    // preorder traversal.  
    static void findPostOrderUtil(int pre[], int n, int minval,int maxval, INT preIndex)  {  
           if (preIndex.data== n)  
            return;  
        if (pre[preIndex.data] < minval || pre[preIndex.data] > maxval) {  
            return;  
        }  
        int val = pre[preIndex.data];  
        preIndex.data++;  
        findPostOrderUtil(pre, n, minval, val, preIndex);  
        findPostOrderUtil(pre, n, val, maxval, preIndex);  
        System.out.print( val + " ");  
    }  
      
    // Function to find postorder traversal.  
    static void findPostOrder(int pre[], int n)  
    {  
      
        INT preIndex = new INT(0);  
        Integer pree=new Integer(0);
        findPostOrderUtil(pre, n, Integer.MIN_VALUE,  
                        Integer.MAX_VALUE,preIndex);  
    }  


private static void preToPostOrderTraversal(int[] pre, int length, int minValue, int maxValue, int index) {
    if(index==length)
	return ;
    if(pre[index] < minValue || pre[index] > maxValue)
	return;
    int val=pre[index];
    index++;
    preToPostOrderTraversal(pre, length, minValue, val, index);
    preToPostOrderTraversal(pre, length, val, maxValue, index);
    System.out.print(val+" ");
    
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0) {
	t--;
	int n=sc.nextInt(),pre[]=new int[n];
	for(int i=0;i<n;i++)
	    pre[i]=sc.nextInt();
	preToPostOrderTraversal(pre,pre.length,Integer.MIN_VALUE,Integer.MAX_VALUE,0);
	findPostOrder(pre, pre.length);
	System.out.println();
    }
}

}
