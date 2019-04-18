package test1;

import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class abcd2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    while(t!=0) {
	t--;
	String s=sc.nextLine();
	int x=1,decimal=0;
	for(int i=s.length()-1;i>=0;i--) {
	    if(s.charAt(i)=='1')
		decimal+=x;
	    x*=2;
	}
	System.out.println(decimal);
    }
}
}
