package Algorithim1;

import java.util.HashMap;
import java.util.Scanner;

public class MaxPQ {

    private Integer[] pq;
    private int N;

    public MaxPQ(int capacity) {
	pq = new Integer[capacity + 1];
	N = 0;
    }

    public boolean isEmpty() {
	return N == 0;
    }

    public void insert(int k) {
	pq[++N] = k;
	swim(N);// at most 1+lg[N] compares is required
    }

    private void swim(int k) {
	while (k / 2 >= 1) {
	    int j = k / 2;
	    if (less(k, j))
		break;
	    exch(k, j);
	    k = j;
	}
    }
//    private void sink(int k) {
//	while(2*k<=N) {
//	    j=2*k;
//	    if(j<N && less(j,j+1))
//		j++;
//	    if(!less(k,j))
//		break;
//	    exch(k,j);
//	    k=j;
//	}
//    }

    private void sink(int k) {
	while (2 * k <= N) {
	    int j = 2 * k;
	    if (j < N && less(j, j + 1))
		j++;
	    if (!less(k, j))
		break;
	    exch(k, j);
	    k = j;
	}
    }

    public int deleteMax() {
	int max = pq[1];
	exch(1, N--);
	sink(1);
	pq[N + 1] = null;// prevent loitering
	return max;
    }

    public boolean less(int i, int j) {
	return pq[i].compareTo(pq[j]) < 0;
    }

    public void exch(int i, int j) {
	int t = pq[i];
	pq[i] = pq[j];
	pq[j] = t;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	MaxPQ maxHeap = new MaxPQ(n);
	//Build Heap using bottom up manner
       /**
	 * for(int k=N/2;k>=1;k++) 
	 * sink(a,k,N);
	 * while(N>1){
	 * exch(a,1,N--);
	 * sink(a,1,N);
	 * }
	 */
	    
	
	for (int i = 0; i < n; i++) {
	    maxHeap.insert(sc.nextInt());
	}
	while (!maxHeap.isEmpty()) {
	    System.out.println(maxHeap.deleteMax());
	}

    }
}
