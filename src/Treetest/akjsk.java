package Treetest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class akjsk {
public static void main(String[] args) {
    akjsk m=null,n=null;
    System.out.println();
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt(),M=sc.nextInt();
    Map<Integer,List<Integer>> edges=new HashMap<>();
    for(int i=0;i<M;i++) {
	int a=sc.nextInt(),b=sc.nextInt();
	List<Integer> c=edges.get(b);
	if(c.isEmpty())
	   c = new ArrayList<>();
	c.add(a);
	edges.put(b, c);
    }
    int  q=sc.nextInt();
    for(int i=0;i<q;i++) {
	int  x=sc.nextInt(),y=sc.nextInt();
	List<Integer> b=edges.get(y);
//	for(int i:b) {
//	    if(i==x)
//		count++;
//	    
//	}
    }
}
}
