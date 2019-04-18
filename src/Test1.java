import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String P = sc.nextLine(), T = sc.nextLine();
	int PL = P.length(), TL = T.length(), lts[] = new int[PL];
	lts[0] = 0;
	int len = 0, i = 1;
	while (i < PL) {
	    if (P.charAt(i) == P.charAt(len)) {
		len++;
		lts[i] = len;
		i++;
	    } else {
		if (len != 0) {
		    lts[i] = lts[len - 1];
		    len = len - 1;
		} else {
		    lts[i] = 0;
		    len = 0;
		    i++;
		}
	    }
	}
	int j = 0;
	i = 0;
	while (i < TL) {
	    if (T.charAt(i) == P.charAt(j)) {
		i++;
		j++;
	    }
	    if (j == PL) {
		System.out.println("Match found at index ---> " + (i - j));
		j = lts[j - 1];
	    } else if (i < TL && T.charAt(i) != P.charAt(j)) {
		if (j != 0)
		    j = lts[j - 1];
		else
		    i = i + 1;
	    }
	}

    }
}
/*
 * TEST EXAMPLE
 *  ABABCABAB
 *  ABABDABACDABABCABAB
 */