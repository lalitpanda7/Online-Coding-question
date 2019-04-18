import java.util.Scanner;

public class Knuth_Morris_Pratt___KMP___Algorithm {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String P = sc.nextLine(), T = sc.nextLine();
	sc.close();
	int n = P.length(), lts[] = new int[n], len = 0;
	lts[0] = 0;
	for (int i = 1; i < n;) {
	    if (P.charAt(i) == P.charAt(len)) {
		len++;
		lts[i] = len;
		i++;
	    } else {
		if (len != 0)
		    len = lts[len - 1];
		else {
		    lts[i] = 0;
		    i++;
		}
	    }
	}
	int i = 0; // index for txt[]
	int j = 0; // index for pat[]
	while (i < T.length()) {
	    if (P.charAt(j) == T.charAt(i)) {
		j++;
		i++;
	    }
	    if (j == n) {
		System.out.println("Found pattern " + "at index " + (i - j));
		j = lts[j - 1];
	    }

	    // mismatch after j matches
	    else if (i < T.length() && P.charAt(j) != T.charAt(i)) {
		// Do not match lps[0..lps[j-1]] characters,
		// they will match anyway
		if (j != 0)
		    j = lts[j - 1];
		else
		    i = i + 1;
	    }
	}
	for (int i1 = 0; i1 < n; i1++) {
	    System.out.println("index " + i1 + " Value " + P.charAt(i1) + " LPS Value " + lts[i1]);
	}

    }
}
