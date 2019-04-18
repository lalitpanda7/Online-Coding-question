import java.util.Scanner;

public class pellindrome {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	System.out.println(s.length());
	int l = s.length(), tab[][] = new int[l][l], start = 0, max = 1;
	for (int i = 0; i < l; i++)
	    tab[i][i] = 1;
	for (int i = 0; i < l - 1; i++) {
	    if (s.charAt(i) == s.charAt(i + 1)) {
		start = i;
		tab[i][i + 1] = 1;
		max = 2;
	    }
	}
	for (int k = 3; k <= l; ++k) {
	    for (int i = 0; i < l - k + 1; i++) {
		int j = i + k - 1;
		if (tab[i + 1][j - 1] == 1 && s.charAt(i) == s.charAt(j)) {
		    start = i;
		    max = k;
		    tab[i][j]=1;
		}
	    }
	}
	System.out.println(max+"\n"+s.substring(start, start+max));
	//System.out.println("the length of longest pellindromic substring is "+max+" Start at index "+ start+" is "+s.substring(start, start+max));
    }
}
