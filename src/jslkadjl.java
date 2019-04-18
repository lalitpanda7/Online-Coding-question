import java.util.Scanner;

public class jslkadjl {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),M=sc.nextInt();
    long D=A%M;
    A=1;
    for(int i=0;i<B;i++)
    A*=D;
    
    A/=C;
    System.out.println(A%M);
}
}
