package BTree;

public class Program {
    //    public static BinNode  BuildTree{
//       BinNode  t=new BinNode (1) ;
//       t.setLeft(new BinNode (3));
//      t.getLeft().setLeft(new BinNode (4));
//      return t.getRoot();
//    }
    public static void main(String[] args) {
        BinTree tree=new BinTree();
        tree.insert(1);
        tree.insert(4);
        tree.insert(3007);
        tree.insert(5);
        tree.insert(2);
        BinNode  t=new BinNode (1) ;
        System.out.println(tree);
//        System.out.println(tree.isInMyFamily(2,2));
//        tree.printSmallerThanX(5,tree.getRoot());
        System.out.println(  tree.maxValue(tree.getRoot(),0));
    }
}
