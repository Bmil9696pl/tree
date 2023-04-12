

public class Tree {
    protected int value;
    protected Tree leftNode;
    protected Tree rightNode;

    public Tree(int value){
        this.value = value;
        leftNode = null;
        rightNode = null;
    }
    public Tree(int value, Tree left, Tree right){
        this.value = value;
        this.leftNode = left;
        this.rightNode = right;
    }

    public void setLeftNode(Tree leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Tree rightNode) {
        this.rightNode = rightNode;
    }

    public int longestBranch(){
        int leftBrach = 0;
        int rightBranch = 0;
        if(leftNode != null){
            leftBrach = leftNode.longestBranch() + 1;
        }
        if(rightNode != null){
            rightBranch = rightNode.longestBranch() + 1;
        }
        return Math.max(leftBrach, rightBranch);
    }

    public int countLeafs(){
        if(leftNode == null && rightNode == null){
            return 1;
        }
        int leftLeafs = 0;
        int rightLeafs = 0;
        if(leftNode != null){
            leftLeafs = leftNode.countLeafs();
        }
        if(rightNode != null) {
            rightLeafs = rightNode.countLeafs();
        }

        return leftLeafs + rightLeafs;
    }

    public static boolean compare(Tree tree1, Tree tree2){
        if(tree1 == null && tree2 == null){
            return true;
        }
        if(tree1 == null || tree2 == null){
            return false;
        }
        if(tree1.getValue() != tree2.getValue()){
            return false;
        }

        return compare(tree1.getLeftNode(), tree2.getLeftNode()) && compare(tree1.getRightNode(), tree2.getRightNode());
    }

    public int getValue() {
        return value;
    }

    public Tree getLeftNode() {
        return leftNode;
    }

    public Tree getRightNode() {
        return rightNode;
    }
}
