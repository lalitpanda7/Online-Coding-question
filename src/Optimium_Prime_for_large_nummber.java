import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.InputMismatchException;

public class Optimium_Prime_for_large_nummber {
    public static void main(String args[]){

	InputReader in = new InputReader(System.in);
	PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

	int tt = in.nextInt();

	while (tt-- > 0) {
	    long n = in.nextLong();
	    BigInteger b = new BigInteger(String.valueOf(n));
	    if (b.isProbablePrime(1)) {
		out.println("prime");
	    } else {
		out.println("composite");
	    }
	}
	out.close();
    }

    static long[] t;

    static void Dr() {
	DR[0] = 1;
	DR[1] = 0;
	DR[2] = 1;
	for (int i = 3; i < 101; i++) {
	    DR[i] = ((i - 1) * (DR[i - 1] + DR[i - 2]) % MOD) % MOD;
	}

    }

    static long modpowIter(long a, long b) {
	long ans = 1;

	// c=(int)(1e9+7);
	while (b != 0) {
	    if (b % 2 == 1)
		ans = (ans * a) % MOD;

	    a = (a * a) % MOD;
	    b /= 2;

	}
	return ans % MOD;
    }

    static long fac[], ifac[], DR[] = new long[101];
    static int MOD = (int) (1e9 + 7);
    static boolean[] isPrime;

    static void precompute() {
	int i;
	int N = 100005;
	fac = new long[N];
	ifac = new long[N];
	fac[0] = 1;
	for (i = 1; i < N; i++) {
	    fac[i] = (i * fac[i - 1]) % MOD;
	}
	ifac[N - 1] = modpowIter(fac[N - 1], MOD - 2);
	for (i = N - 2; i >= 0; i--) {
	    ifac[i] = ((i + 1) * ifac[i + 1]) % MOD;

	}
    }

    public static long combine(int n, int k) {
	if (k > n - k) {
	    k = n - k;
	}
	long result = 1;
	for (int i = 0; i < k; i++) {
	    result *= (n - i);
	    // result=result%MOD;
	    result /= (i + 1);

	    result = result % MOD;
	}
	return result % MOD;
    }

    static long modBinomial(int n, int k) {
	// calculates C(n,k) mod p (assuming p is prime).
	// if(k>n-k)k=n-k;
	long an; // n * (n-1) * ... * (n-k+1)

	an = fac[n] % MOD;
	an *= ifac[n - k];
	an %= MOD;
	an *= ifac[k];
	an %= MOD;

	// numerator / denominator mod p.
	return an;
    }

    static int gcd(int num1, int num2) {
	if (num1 > num2) {
	    int temp = num1;
	    num1 = num2;
	    num2 = temp;
	}
	while (num1 != 0) {
	    int temp = num1;
	    num1 = num2 % num1;
	    num2 = temp;
	}
	return num2;
    }

    static void sieve() {

	isPrime = new boolean[1000001];
	for (int i = 0; i <= 1000000; ++i) {
	    isPrime[i] = true;
	}
	isPrime[0] = false;
	isPrime[1] = false;
	for (int i = 2; i * i <= 1000000; ++i) {
	    if (isPrime[i] == true) {
		for (int j = i * i; j <= 1000000; j += i)
		    isPrime[j] = false;
	    }
	}

    }

    static class InputReader {
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	public InputReader(InputStream stream) {
	    this.stream = stream;
	}

	public static boolean isWhitespace(int c) {
	    return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public int read() {
	    if (numChars == -1)
		throw new InputMismatchException();
	    if (curChar >= numChars) {
		curChar = 0;
		try {
		    numChars = stream.read(buf);
		} catch (IOException e) {
		    throw new InputMismatchException();
		}
		if (numChars <= 0)
		    return -1;
	    }
	    return buf[curChar++];
	}

	public int nextInt() {
	    int c = read();
	    while (isSpaceChar(c))
		c = read();
	    int sgn = 1;
	    if (c == '-') {
		sgn = -1;
		c = read();
	    }
	    int res = 0;
	    do {
		if (c < '0' || c > '9')
		    throw new InputMismatchException();
		res *= 10;
		res += c - '0';
		c = read();
	    } while (!isSpaceChar(c));
	    return res * sgn;
	}

	public long nextLong() {
	    int c = read();
	    while (isSpaceChar(c))
		c = read();
	    int sgn = 1;
	    if (c == '-') {
		sgn = -1;
		c = read();
	    }
	    long res = 0;
	    do {
		if (c < '0' || c > '9')
		    throw new InputMismatchException();
		res *= 10;
		res += c - '0';
		c = read();
	    } while (!isSpaceChar(c));
	    return res * sgn;
	}

	public String nextToken() {
	    int c = read();
	    while (isSpaceChar(c))
		c = read();
	    StringBuilder res = new StringBuilder();
	    do {
		res.appendCodePoint(c);
		c = read();
	    } while (!isSpaceChar(c));
	    return res.toString();
	}

	public boolean isSpaceChar(int c) {
	    if (filter != null)
		return filter.isSpaceChar(c);
	    return isWhitespace(c);
	}

	public interface SpaceCharFilter {
	    public boolean isSpaceChar(int ch);
	}
    }
}