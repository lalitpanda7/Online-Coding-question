import java.util.Scanner;

public class test {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	long A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), M = sc.nextInt();
//969109092 60139073 122541116 75884463
	long D = A % M;
	long result = 1;
	while (B > 0) {
	    if (B % 2 == 1)
		result = (result * A) % M;
	    A = (A * A) % M;
	    B = B / 2;
	}
	C = C % M;
	A = (result * C) % M;
	System.out.println(A);

    }
}
