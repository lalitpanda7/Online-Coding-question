import java.util.Scanner;

public class test1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n!=0) {
	n--;
	long m=sc.nextLong();
	if(m<=0)
	    System.out.println("NO");
	while(m>=1) {
	    if(m==1)
	    {
		System.out.println("YES");
		break;
	    }
	    if(m%2==0) {
		m=m/2;
	    }else {
		System.out.println("NO");
		break;
	    }
	}
    }
}
}
