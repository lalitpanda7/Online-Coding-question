import java.util.Scanner;
public class GCD_Optimal_Solution {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0){
        t--;
    int a=sc.nextInt(),b=sc.nextInt(),d=a*b;
    while(b!=0) {
	int c=a;
	a=b;
	b=c%b;
    }
    System.out.println(d/a+ " " +a);
}
	 }
}
