package Tree;

public class BinarySearchTree {

    private class TreeNode{
	private int key;
	private String value;
	private TreeNode left,right;
	TreeNode(int key,String value){
	    this.key=key;
	    this.value=value;
	}
    }
    public TreeNode root;
    public void insert(int key,String value) {
	TreeNode node=new TreeNode(key, value);
	if(root==null) {
	    root=node;
	}else {
	    TreeNode current=root;
	    while(current!=null) {
		if(current.key>key)
		    current=current.left;
		else
		    current=current.right;
	    }
	    current=node;
	}
    }
}
