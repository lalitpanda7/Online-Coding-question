import java.util.Scanner;

public class abc1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while (t != 0) {
	    t--;
	    int n=sc.nextInt(),Zero=0,One=0,Two=0;
	    for(int i=0;i<n;i++)
		{int a=sc.nextInt();
		if(a==0)
		    Zero++;
		else if(a==1)
		    One++;
		else
		    Two++;
		}
	    StringBuffer str = new StringBuffer();	
	    for(int i=0;i<n;i++) {
		if(Zero>0)
		{Zero--;
		   str.append(0+" ");
		}else if(One>0)
		{One--;
		str.append(1+" ");
		    continue;
		}else if(Two>0)
		{Two--;
		str.append(2+" ");
		    continue;
		}
	    }
	    System.out.println(str);
    }
    }
}
