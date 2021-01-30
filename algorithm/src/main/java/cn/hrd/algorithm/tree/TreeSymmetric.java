package cn.hrd.algorithm.tree;

/**
 * 对称二叉树
 * @author hrd <br/>
 * @date 2021/1/30
 */
public class TreeSymmetric {

//    对称二叉树定义： 对于树中 任意两个对称节点 LL 和 RR ，一定有：
//    L.val = R.valL.val=R.val ：即此两对称节点值相等。
//    L.left.val = R.right.valL.left.val=R.right.val ：即 LL 的 左子节点 和 RR 的 右子节点 对称；
//    L.right.val = R.left.valL.right.val=R.left.val ：即 LL 的 右子节点 和 RR 的 左子节点 对称。


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(10);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
    }


    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }

    boolean recur(TreeNode L, TreeNode R) {
        if(L == null && R == null){
            return true;
        }

        if(L == null || R == null || L.val != R.val){
            return false;
        }

        return recur(L.left, R.right) && recur(L.right, R.left);
    }


}
