package cn.hrd.algorithm.tree;

/**
 *  平衡二叉树
 * @author hrd <br/>
 * @date 2021/1/22
 */
public class TreeBalanced {

    public static void main(String[] args) {
        //输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
        //思路是对二叉树做后序遍历，从底至顶返回子树深度，若判定某子树不是平衡树则 “剪枝” ，直接向上返回。

    }

    //recur(root) 函数：
    //
    //返回值：
    //  当节点root 左 / 右子树的深度差 \leq 1≤1 ：则返回当前子树的深度，即节点 root 的左 / 右子树的深度最大值 +1+1 （ max(left, right) + 1 ）；
    //  当节点root 左 / 右子树的深度差 > 2>2 ：则返回 -1−1 ，代表 此子树不是平衡树 。

    //终止条件：
    //  当 root 为空：说明越过叶节点，因此返回高度 00 ；
    //  当左（右）子树深度为 -1−1 ：代表此树的 左（右）子树 不是平衡树，因此剪枝，直接返回 -1−1 ；
    //  isBalanced(root) 函数：
    //
    //  返回值： 若 recur(root) != -1 ，则说明此树平衡，返回 truetrue ； 否则返回 falsefalse 。
    //
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = recur(root.left);
        if(left == -1){
            return -1;
        }

        int right = recur(root.right);
        if(right == -1){
            return -1;
        }

        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

    /**
     * 思路是构造一个获取当前子树的深度的函数 depth(root) （即 面试题55 - I. 二叉树的深度 ），通过比较某子树的左右子树的深度差 abs(depth(root.left) - depth(root.right)) <= 1 是否成立，来判断某子树是否是二叉平衡树。若所有子树都平衡，则此树平衡。
     *
     *
     *
     * @param root
     * @return
     */
    public boolean isBalanced2(TreeNode root) {
        //isBalanced(root) 函数： 判断树 root 是否平衡
        //
        //特例处理： 若树根节点 root 为空，则直接返回 truetrue ；
        //返回值： 所有子树都需要满足平衡树性质，因此以下三者使用与逻辑 \&\&&& 连接；
        //  abs(self.depth(root.left) - self.depth(root.right)) <= 1 ：判断 当前子树 是否是平衡树；
        //  self.isBalanced(root.left) ： 先序遍历递归，判断 当前子树的左子树 是否是平衡树；
        //  self.isBalanced(root.right) ： 先序遍历递归，判断 当前子树的右子树 是否是平衡树；
        //  depth(root) 函数： 计算树 root 的深度
        //
        //终止条件： 当 root 为空，即越过叶子节点，则返回高度 00 ；
        //返回值： 返回左 / 右子树的深度的最大值 +1+1 。


        if (root == null) return true;
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }


}
