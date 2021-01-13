package cn.hrd.algorithm.tree;

import java.util.LinkedList;

/**
 *  二叉树镜像
 * @author hrd <br/>
 * @date 2021/1/13
 */
public class SolutionMirror {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        SolutionMirror mirror = new SolutionMirror();

        mirror.levelTraverse(root);
        mirror.mirrorTree(root);
        System.out.println();
        mirror.levelTraverse(root);
    }

    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;

    }

    public void levelTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val+"  ");
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }



}
