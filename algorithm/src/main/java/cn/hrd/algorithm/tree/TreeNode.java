package cn.hrd.algorithm.tree;

/**
 * @author hrd <br/>
 * @date 2020/8/15
 */
public class TreeNode {


    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        left = left;
        right = right;
    }

}
