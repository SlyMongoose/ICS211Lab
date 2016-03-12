public class Demo {
 
  public static void main(String[] args) {
    BinaryTreeLab bt = new BinaryTreeLab();
    bt .insert(40)
        .insert(25)
        .insert(78)
        .insert(10)
        .insert(3)
        .insert(8)
        .insert(5)
        .insert(44)
        .insert(17)
        .insert(32)
        .insert(30)
        .insert(38)
        .insert(6)
        .insert(50)
        .insert(93);

    System.out.println("Inorder traversal");

    bt.printInorder();

    System.out.println("Preorder Traversal");

    bt.printPreorder();

    System.out.println("Postorder Traversal");
    bt.printPostorder();
  }

}
