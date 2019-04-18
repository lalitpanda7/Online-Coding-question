import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class TestClass {
    public static void main(String args[] ) throws Exception {
           Scanner sc =new Scanner(System.in);
    int N=sc.nextInt(),M=sc.nextInt(),A[][]=new int[N][N];
    for(int i=0;i<M;i++) {
	int a=sc.nextInt(),b=sc.nextInt();
	A[a][b]=1;
    }
    int Q=sc.nextInt();
    for(int i=0;i<Q;i++) {
	int a=sc.nextInt(),b=sc.nextInt();
	if(A[a][b]==1) {
	    System.out.println("YES");
	}else {
	    System.out.println("No");
	}
    }

    }
}
