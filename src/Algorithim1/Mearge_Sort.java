package Algorithim1;

import java.util.Scanner;

public class Mearge_Sort {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	for (int i = 0; i < n; i++) {
	    a[i] = sc.nextInt();
	}
	sort(a);
	for (int i = 0; i < n; i++) {
	    System.out.print(a[i] + " ");
	}
    }

    private static void sort(int[] a) {
	int[] aux = new int[a.length];
	meargeSort(a, aux, 0, a.length - 1);
    }

    private static void meargeSort(int[] a, int[] aux, int low, int high) {
	if (low >= high) {
	    return;
	}
	int mid = low + (high - low) / 2;
	meargeSort(a, aux, low, mid);
	meargeSort(a, aux, mid + 1, high);
	merge(a, aux, low, mid, high);
    }

    private static void merge(int[] a, int[] aux, int low, int mid, int high) {
	for (int i = low; i <= high; i++) {
	    aux[i] = a[i];
	}
	int j = low;
	int k = mid + 1;
	for (int i = low; i <= high; i++) {
	    if (j > mid) {
		a[i] = aux[k++];
	    } else if (k > high) {
		a[i] = aux[j++];
	    } else if (aux[j] > aux[k]) {
		a[i] = aux[k++];
	    } else {
		a[i] = aux[j++];
	    }
	}
    }
}
