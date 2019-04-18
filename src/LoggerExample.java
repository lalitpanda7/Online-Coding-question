
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LoggerExample {
    public static void main(String[] args) throws SecurityException, IOException {

	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	while(n!=0) {
	    n--;
	    int m=sc.nextInt(), a[]=new int[m-1];
	    for(int i=0;i<m-1;i++)
		a[i]=sc.nextInt();
	    Arrays.sort(a);
	    for(int i=1;i<m;i++) {
		if(i!=a[i-1]) {
		    System.out.println(i);
		    break;}
	    if(i==m-1) {
		System.out.println(m);
		break;}
	    }
	}
	
    }
}