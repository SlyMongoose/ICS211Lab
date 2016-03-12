/**
 * Represents the Binary Search Tree.
 */

public class BinaryTree {
  //Refrence for the root of the tree.
  public Node root;
 
  public BinaryTree insert(int value) {
    Node node = new Node<>(value);
 
    if (root == null) {
      root = node;
      return this;
    }
 
    insertRec(root, node);
    return this;
  }
  private void insertRec(Node latestRoot, Node node) {
 
  }
 
  /**
   * Returns the minimum value in the Binary Search Tree.
   */
  public int findMinimum() {
    if (root == null) {
      return 0;
    }
    Node currNode = root;
    while (currNode.left != null) {
      currNode = currNode.left;
    }
    return currNode.value;
  }
 
  /**
   * Returns the maximum value in the Binary Search Tree
   */
  public int findMaximum() {
    if (root == null) {
      return 0;
    }
 
    Node currNode = root;
    while (currNode.right != null) {
      currNode = currNode.right;
    }
    return currNode.value;
  }
 
  /**
   * Printing the contents of the tree in an inorder way.
   */
  public void printInorder() {
    printInOrderRec(root);
    System.out.println("");
  }
  /**
   * Helper method to recursively print the contents in an inorder way
   */
  private void printInOrderRec(Node currRoot) {

  }
 
  /**
   * Printing the contents of the tree in a Preorder way.
   */
  public void printPreorder() {
    printPreOrderRec(root);
    System.out.println("");
  }
  /**
   * Helper method to recursively print the contents in a Preorder way
   */
  private void printPreOrderRec(Node currRoot) {
  
  }

 
  /**
   * Printing the contents of the tree in a Postorder way.
   */
  public void printPostorder() {
    printPostOrderRec(root);
    System.out.println("");
  }
  /**
   * Helper method to recursively print the contents in a Postorder way
   */
  private void printPostOrderRec(Node currRoot) {

  }
  
  /**
   * Represents a node in the Binary Search Tree.
   */
  public class Node<T> {
    //The value present in the node.
    public int value;
    //The reference to the left subtree.
    public Node left;
    //The reference to the right subtree.
    public Node right;
    public Node(int value) {
      this.value = value;
    }
  }
}