package cn.hrd.algorithm.tree;

/**
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 * 二叉搜索树的第k大节点
 * @author hrd <br/>
 * @date 2021/1/19
 */
public class TreeKthLargest {

    int res, k;

    /**
     * 方法：倒过来的中序遍历。
     *        我们都知道，中序遍历一颗二叉搜索树会得到一个升序的数字序列。但是题目要我们求第 k 大的数，那如果我们 somehow 能得到一个降序的数字序列，岂不是马上就能做出来吗？
     *        由此我们可以轻易想出，只需要把原本是 “左中右” 的中序遍历改成 “右中左” 的反向中序遍历即可。这就是本题唯一的思维考点了（个人觉得）。
     *        然后维护两个变量 count 和 res 即可。count 用来计数我们在降序的数字序列中走了几位，当走了 k 位时，就让 res 等于当前的 root -> val，然后退出 inorder 函数即可。
     * @param args
     */
    public static void main(String[] args) {
        //root = [3,1,4,null,2], k = 1  输出: 4

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.left.left.left = new TreeNode(1);

        int k = 1;
        TreeKthLargest kthLargest = new TreeKthLargest();
        int maxNode = kthLargest.kthLargest(root,k);
        System.out.println(maxNode);

    }

    /**
     *  给定一棵二叉搜索树，请找出其中第k大的节点。
     * @param root
     * @param k
     * @return
     */
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }


    public void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(k == 0) return;
        if(--k == 0) res = root.val;
        dfs(root.left);
    }



}
