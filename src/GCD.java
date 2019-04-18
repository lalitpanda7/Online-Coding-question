import java.util.Scanner;

public class GCD {
    public static int Gcd(int a, int b) {
	if (b == 0)
	    return a;
	return Gcd(b, a % b);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (true) {
	    Integer a = sc.nextInt(), b = sc.nextInt();
	    System.out.println(Gcd(a, b)+"\n"+a.hashCode(b)+"\n"+b.hashCode());
	}
    }
}
