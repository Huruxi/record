package cn.hrd.algorithm.tree;

import java.util.LinkedList;

/**
 *
 *  二叉树遍历
 *
 * @author hrd <br/>
 * @date 2021/1/13
 */
public class TreeErgodic {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(10);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeErgodic treeErgodic = new TreeErgodic();
        treeErgodic.preOrderTraverse1(root);
        System.out.println();
        treeErgodic.inOrderTraverse1(root);
        System.out.println();
        treeErgodic.postOrderTraverse1(root);
        System.out.println();
        treeErgodic.levelTraverse(root);

    }



    /**
     * 前序遍历  根结点 ---> 左子树 ---> 右子树
     * @param root
     */
    public void preOrderTraverse1(TreeNode root){

        if(root != null){
            System.out.print(root.val + " ");
            preOrderTraverse1(root.left);
            preOrderTraverse1(root.right);
        }
    }


    /**
     * 中序遍历   左子树 ---> 根结点 ---> 右子树
     * @param root
     */
    public void inOrderTraverse1(TreeNode root) {
        if (root != null) {
            inOrderTraverse1(root.left);
            System.out.print(root.val + " ");
            inOrderTraverse1(root.right);
        }
    }

    /**
     * 后序遍历     左子树 ---> 右子树 ---> 根结点
     * @param root
     */
    public void postOrderTraverse1(TreeNode root) {
        if (root != null) {
            postOrderTraverse1(root.left);
            postOrderTraverse1(root.right);
            System.out.print(root.val+" ");
        }
    }

    /**
     * 层次遍历  只需要一个队列即可，先在队列中加入根结点。之后对于任意一个结点来说，在其出队列的时候，访问之。同时如果左孩子和右孩子有不为空的，入队列
     * @param root
     */
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


    /**
     * 深度优先遍历  其实深度遍历就是上面的前序、中序和后序。但是为了保证与广度优先遍历相照应，也写在这
     * 代码也比较好理解，其实就是前序遍历
     * @param root
     */
    public void depthOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> stack = new LinkedList();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val+"  ");
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }



}
