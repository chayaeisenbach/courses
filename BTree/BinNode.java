package BTree;

public class BinNode {
    private int value;
    private BinNode left;
    private BinNode right;

    public BinNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinNode(int value, BinNode left, BinNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinNode getLeft() {
        return left;
    }

    public void setLeft(BinNode left) {
        this.left = left;
    }

    public BinNode getRight() {
        return right;
    }

    public void setRight(BinNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "\nBinNode{" +
                "value= " + this.getValue() +
                ", left--> " + this.getLeft() +
                ", right--> " + this.getRight() +
                '}';
    }
}
