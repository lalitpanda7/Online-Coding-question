import java.io.File;
import java.time.chrono.IsoEra;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.LinkedBag;
import edu.princeton.cs.algs4.Merge;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

public class example {
public static void main(String[] args) {
    File directory = new File("/home/lalitp/Downloads");
    File[] files=directory.listFiles();
    Insertion.sort(files);
    Merge.sort(files);
    Stack<Integer> a=new Stack<>();
    Queue<Integer> b=new Queue<>();
    LinkedBag<Integer> aa=new LinkedBag<>();
    for(File file:files)
	System.out.println(file.getName());
}
}
