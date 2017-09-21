/*
Solution to
https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/submissions/code/51676453

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
     Only code shown is functions. Main menthos is hidden.
*/
    boolean checkBST(Node root) {
	return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
}
boolean check(Node n, int min, int max){
	if(n==null)
		return true;
	if(n.data <= min || n.data >= max)
		return false;
	return check(n.left, min, n.data) 
		&& check(n.right, n.data, max);
}
