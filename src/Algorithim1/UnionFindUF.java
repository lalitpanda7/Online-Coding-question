package Algorithim1;

public class UnionFindUF {
private int [] id;
public UnionFindUF(int N) {
    for(int i=0;i<N;i++) {
	id[i]=i;
    }
}
public boolean connected(int a,int b) {
    return root(a)==root(b);
}
public int root(int i) {
    while(i!=id[i])
	i=id[i];
    return i;
}
}
