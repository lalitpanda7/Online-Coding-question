import java.util.Scanner;

public class meargeSort_Trail_1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),a[]=new int[n];
    for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
    sort(a);
    for(int a1:a)
	System.out.println(a1);
    
}

private static void sort(int[] a) {
    int aux[]=new int[a.length];
    meargeSort(a,aux,0,a.length-1);
}

private static void meargeSort(int[] a, int[] aux, int low, int high) {
    if(low>=high)
	return;
    int mid=low+(high-low)/2;
    meargeSort(a, aux, low, mid);
    meargeSort(a, aux, mid+1, high);
    mearge(a,aux,low,mid,high);
}

private static void mearge(int[] a, int[] aux, int low, int mid, int high) {
    for(int i=low;i<=high;i++)
	aux[i]=a[i];
    int i=low,j=mid+1;
    for(int k=low;k<=high;k++) {
	if(i>mid) a[k]=aux[j++];
	else if(j>high) a[k]=aux[i++];
	else if(aux[i]<aux[j]) a[k]=aux[i++];
	else
	    a[k]=aux[j++];
    }
}
}
