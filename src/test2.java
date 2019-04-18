import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N=sc.nextInt(),A[]=new int[N],K=0;
	for(int i=0;i<N;i++) {
	    A[i]=sc.nextInt();
	    if(A[i]>K)
		K=A[i];
	}
	int Aux[]=new int[K+1];
	for(int i=0;i<N;i++) {
	    Aux[A[i]]++;
	}
	for(int i=0;i<=K;i++)
	    if(Aux[i]!=0)
		System.out.println(i+" "+Aux[i]);
    }
}
