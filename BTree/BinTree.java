package BTree;

public class BinTree {
    private BinNode root;

    public BinTree() {
        this.root = null;
    }

    public BinNode getRoot() {
        return root;
    }

    public void setRoot(BinNode root) {
        this.root = root;
    }

    public void insert(int value) {
        BinNode n = new BinNode(value);
        BinNode temp, father = null;
        if (root == null) {
            root = n;
        } else {
            temp = root;
            while (temp != null) {
                father = temp;
                if (value < temp.getValue()) temp = temp.getLeft();
                else temp = temp.getRight();
            }
            if (value < father.getValue()) father.setLeft(n);
            else father.setRight(n);
        }
    }

    public BinNode find(int x) {
        BinNode temp = root;
        while (temp != null && temp.getValue() != x) {
            if (x < temp.getValue()) temp = temp.getLeft();
            else temp = temp.getRight();
        }
        return temp;
    }

    public boolean isInMyFamily(int father, int child) {
        BinNode fatherNode = find(father);
        while (fatherNode != null && fatherNode.getValue() != child) {
            if (fatherNode.getValue() < child) fatherNode = fatherNode.getRight();
            else fatherNode = fatherNode.getLeft();
        }
        if (fatherNode != null && fatherNode.getValue() == child) return true;
        return false;
    }

    public void printInOrder(BinNode bN) {
        if (bN != null) {
            printInOrder(bN.getLeft());
            System.out.print(bN.getValue() + " ");
            printInOrder(bN.getRight());
        }
    }

    public void printSmallerThanX(int x, BinNode bN) {
//זה יהיה רק בעץ חיפוש בינרי!!!
//        BinNode temp = find(x);
//        if (temp != null)
//            System.out.println(temp.getLeft());

        if (bN != null) {
            printSmallerThanX(x, bN.getLeft());
            if (bN.getValue() < x) System.out.println(bN.getValue() + " ");
            printSmallerThanX(x, bN.getRight());
        }
    }

    public int maxValue(BinNode bN, int max) {
        if (bN == null) return 0;
        if (bN.getRight() == null && bN.getLeft() == null) {
            max = bN.getValue() > max ? bN.getValue() : max;
            return max;
        }
        return Math.max(bN.getValue(), Math.max(maxValue(bN.getLeft(), max), maxValue(bN.getRight(), max)));
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
