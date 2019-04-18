package Algorithim1;

import java.util.Arrays;
import java.util.List;

public class ajh {
    public static void main(String[] args) {
	int max = 10;
	List<Integer> sprints = Arrays.asList(9, 7, 3, 1);
	for (int i = 0; i < sprints.size(); i++)
	    if (max < sprints.get(i))
		max = sprints.get(i);
	int[] a = new int[max + 1];

	for (int i : a)
	    System.out.println(i);
	for (int i = 1; i < sprints.size(); i++) {
	    if (sprints.get(i - 1) <= sprints.get(i)) {
		for (int j = sprints.get(i - 1); j <= sprints.get(i); j++)
		    a[j]++;
	    } else {
		for (int j = sprints.get(i); j <= sprints.get(i - 1); j++)
		    a[j]++;
	    }
	}
	max = 0;
	int max1 = -1;
	for (int i = 0; i < a.length; i++) {
	    if (max1 > a[i]) {
		max = i;
		max1 = a[i];
	    }
	}
	System.out.println(max);

    }
}
