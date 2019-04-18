import java.util.Scanner;

import edu.princeton.cs.algs4.StdRandom;

public class QuickSort {
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(), a[] = new int[n];
	for (int i = 0; i < n; i++)
	    a[i] = sc.nextInt();
	sort(a);
	System.out.print("[");
	    for(int i=0;i<a.length;i++)
		if(i==a.length-1)
		System.out.print(a[i]+"]");
	        else
		System.out.print(a[i]+",");
    }

    private static void sort(int[] a) {
	StdRandom.shuffle(a);
	quicksort(a, 0, a.length - 1);
    }

    private static void quicksort(int[] a, int low, int high) {
	if (low >= high)
	    return;
	int j = partition(a, low, high);
	quicksort(a, low, j - 1);
	quicksort(a, j + 1, high);
    }

    private static int partition(int[] a, int low, int high) {
	int i = low, j = high+1;
	while (true) {
	    while (a[++i] < a[low]) {
		if (i == high)
		    break;
	    }
	    while (a[low] < a[--j])
		if (j == low)
		    break;
	    if (i >= j)
		break;
	    swap(a, i, j);
	}
	swap(a, low, j);
	return j;
    }

    private static void swap(int[] a, int low, int j) {
	int x = a[low];
	a[low] = a[j];
	a[j] = x;

    }
}
