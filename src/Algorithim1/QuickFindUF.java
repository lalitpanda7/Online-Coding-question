package Algorithim1;

public class QuickFindUF {
private int[] id;
public  QuickFindUF(int N) {
    id = new int  [N];
    for(int i=0;i<N;i++) {
	id[i]=i;
    }
}
public boolean connected(int a, int b) {
	return id[a]==id[b];
}
public void union(int a,int b) {
    int  pid=id[a];
    int  qid=id[b];
    for(int i=0;i<id.length;i++) {
	if(id[i]==pid) {
	    id[i]=qid;
	}
    }
}
}
