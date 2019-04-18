import java.util.Scanner;

public class Prime_numbers_within_a_number {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while (t != 0) {
	    t--;
	    int n = sc.nextInt();
	    boolean isPrime[] = new boolean[n + 1];
	    isPrime[0]=false;
	    isPrime[1]=false;
	    for(int i=2;i<=n;i++)
		isPrime[i]=true;
	    for(int i=2;i*i<=n;i++) {
		for(int j=i*i;j<=n;j=j+i)
		    isPrime[j]=false;
	    }
	    for(int  i=0;i<=n;i++)
		if(isPrime[i])
		    System.out.print(i+" ");
	    System.out.println();

	}
    }
}
