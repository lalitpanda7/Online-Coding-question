package Algorithim1;

public class QuickUnionUF {

    private int id[];
    public QuickUnionUF(int N) {
	id=new int [N];
	for(int i=0;i<N;i++) {
	    id[i]=i;
	}
    }
    private int root(int i) {
	while(i!=id[i])
	    i=id[i];
	return i;
    }
    public boolean connected(int  a,int b) {
	return root(a)==root(b);
    }
    public void union(int p,int  q) {
	int pid=root(p);
	int qid=root(q);
	id[pid]=qid;
    }
}
