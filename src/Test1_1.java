import java.util.Scanner;

public class Test1_1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String txt=sc.nextLine(),prg=sc.nextLine();
    int l1=txt.length(),l2=prg.length(),len=0,i=1,lts[]=new int[l2];
    lts[0]=0;
    while(l2>i) {
	if(prg.charAt(i)==prg.charAt(len)) {
	    lts[i]=len;
	    i++;
	    len++;
	}else {
	    if(len!=0 && prg.charAt(i)!=prg.charAt(len)) {
		lts[i]=lts[len-1];
		len=len-1;
	    }else {
		i++;
	    }
	}
    }
    int j=0;
    i=0;
    while(i<l1) {
	if(txt.charAt(i)==prg.charAt(j)) {
	    i++;
	    j++;
	}
	if(j==l2) {
	    System.out.println("Match found  at index ------>"+(i-j));
	    j=lts[j-1];
	}else if(i < l1 && txt.charAt(i)!=prg.charAt(j)) {
	    if(j!=0)
		j=lts[j-1];
	    else
		i++;
	}
    }
}
}
