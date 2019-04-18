import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n!=0) {
	n--;
	int A=sc.nextInt(),B=sc.nextInt(),C=A^B,count=0;
	String D=Integer.toBinaryString(C);
	for(int i=0;i<D.length();i++)
	    if(D.charAt(i)=='1')
		count++;
	System.out.println(count);
    }
    
}
}
