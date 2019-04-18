package Treetest;

public class Check_for_BST {
Node root;
int isBST(Node root)  
{
    if(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
	return 1;
    return 0;
    }
public static boolean isBST(Node node, int minKey, int maxKey)
{
	// base case
	if (node == null) {
		return true;
	}

	// if node's value fall outside valid range
	if (node.data < minKey || node.data > maxKey) {
		return false;
	}

	// recursively check left and right subtrees with updated range
	return isBST(node.left, minKey, node.data) &&
		isBST(node.right, node.data, maxKey);
}
int isBinarySearchTree(Node root) {
    if(isBinarySearchTree(root,Integer.MAX_VALUE,Integer.MIN_VALUE))
	return 1;
    return 0;
}
private boolean isBinarySearchTree(Node root2, int maxValue, int minValue) {
  if(root2==null)
      return true;
  if(maxValue<root2.data || minValue>root2.data)
    return false;
  return isBinarySearchTree(root2.left, root2.data, minValue)&&isBinarySearchTree(root2, maxValue, root2.data);
}
}
