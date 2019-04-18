import java.util.Scanner;

public class Pellindrome_Optimum {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String  s=sc.nextLine();
    int start=0,len=s.length(),low,high,maxLength=1;
    for(int i=1;i<len;i++) {
	low=i-1;
	high=i;
	while(low >= 0 &&  high < len && s.charAt(low)==s.charAt(high)) {
	    if(high-low+1>maxLength) {
		start = low;
		maxLength=high-low+1;
	    }
	    low--;
	    high++;
	}
	low=i-1;
	high=i+1;
	while(low >= 0 && high < len && s.charAt(low)==s.charAt(high)) {
	    if(maxLength<high-low+1) {
		maxLength=high-low+1;
		start=low;
	    }
	    low--;
	    high++;
	}
    }
    System.out.println(maxLength+"\n"+s.substring(start, start+maxLength));
}
}