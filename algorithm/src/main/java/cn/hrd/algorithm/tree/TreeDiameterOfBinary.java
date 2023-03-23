package cn.hrd.algorithm.tree;

/**
 *  二叉树的直径
 * @author hrd <br/>
 * @date 2021/2/1
 */
public class TreeDiameterOfBinary {


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right = new TreeNode(3);

        TreeDiameterOfBinary diameterOfBinary = new TreeDiameterOfBinary();
        diameterOfBinary.diameterOfBinaryTree(root);
        System.out.println(diameterOfBinary.ans);
    }

    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }

    public int depth(TreeNode node) {
        if (node == null) {
            return 0; // 访问到空节点了，返回0
        }

        int L = depth(node.left); // 左儿子为根的子树的深度
        int R = depth(node.right); // 右儿子为根的子树的深度
        ans = Math.max(ans, L+R+1); // 计算d_node即L+R+1 并更新ans
        return Math.max(L, R) + 1; // 返回该节点为根的子树的深度
    }


}
