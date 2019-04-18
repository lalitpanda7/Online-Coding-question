import java.util.Scanner;

public class Is_It_Prime_Number {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0) {
	t--;
    int n=sc.nextInt();
    boolean isPrime=true;
    for(int i=2;i*i<=n;i++) {
	if(n%i==0) {
	    isPrime=false;}
    }
    if(isPrime) {
	System.out.println("Yes");
    }else
	System.out.println("No");
    }
	
}
}
