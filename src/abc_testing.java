import java.util.ArrayList;
import java.util.Scanner;

public class abc_testing {
public static void main(String[] args) { ArrayList<Long> Fac=new ArrayList<>();
Fac.add(1L);
for(int i=2;i<100000;i++)
{
	Fac.add(i-1, (Fac.get(i-2)*i)%(1000000007));
}
Scanner sc=new Scanner(System.in);
int T=sc.nextInt(),count=0;

while(T!=0) {
	T--;
	int n=sc.nextInt();
	if(n>0)
	System.out.println(Fac.get(n-1));
	else
	    System.out.println(1);
}

}
}
