package cn.hrd.algorithm.tree;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 *  二叉树遍历
 *
 * @author hrd <br/>
 * @date 2021/1/13
 */
public class TreeErgodic {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(6);
        root.left.left.right.left = new TreeNode(7);
        root.left.left.right.right = new TreeNode(8);

        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);

        TreeErgodic treeErgodic = new TreeErgodic();
//        treeErgodic.preOrderTraverse1(root);
        System.out.println();
        treeErgodic.postOrderTraverse1(root);
        System.out.println();
        treeErgodic.postorderTraversal(root);

//        treeErgodic.middleorderTraversal(root);

//        treeErgodic.postOrderTraverse1(root);
//        System.out.println();
//        treeErgodic.levelTraverse(root);

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
     * 非递归先序遍历  根结点 ---> 左子树 ---> 右子树
     * @param root
     */
    public static void preorderTraversal(TreeNode root) {
        // 用来暂存节点的栈
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();

        // 新建一个游标节点为根节点
        TreeNode node = root;

        // 当遍历到最后一个节点的时候，无论它的左右子树都为空，并且栈也为空
        // 所以，只要不同时满足这两点，都需要进入循环

        while (node != null || !treeNodeStack.isEmpty()) {
            // 若当前考查节点非空，则输出该节点的值
            // 由考查顺序得知，需要一直往左走

            while (node != null) {
                System.out.print(node.val + " ");
                // 为了之后能找到该节点的右子树，暂存该节点
                treeNodeStack.push(node);
                node = node.left;
            }

            // 一直到左子树为空，则开始考虑右子树
            // 如果栈已空，就不需要再考虑
            // 弹出栈顶元素，将游标等于该节点的右子树
            if (!treeNodeStack.isEmpty()) {
                node = treeNodeStack.pop();
                node = node.right;
            }
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
     * 中序遍历     左子树 ---> 根结点 ---> 右子树
     * @param root
     */
    public void middleorderTraversal(TreeNode root){

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;

        while (node != null || !stack.isEmpty()){

            while (node != null){
                stack.push(node);
                node = node.left;
            }

            if(!stack.isEmpty()){
                TreeNode treeNode = stack.pop();
                System.out.print(treeNode.val + " ");
                node = treeNode.right;
            }
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
            System.out.print(root.val + " ");
        }
    }

    /**
     * 非递归 后序遍历    左子树 ---> 右子树 ---> 根结点
     * @param root
     */
    public void postorderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        TreeNode lastVisit = root;

        while (node != null || !stack.isEmpty()){

            while (node != null){
                stack.push(node);
                node = node.left;
            }

            //查看当前栈顶元素
            node = stack.peek();

            //如果其右子树也为空，或者右子树已经访问
            //则可以直接输出当前节点的值
            if (node.right == null || node.right == lastVisit) {
                System.out.print(node.val + " ");
                stack.pop();
                lastVisit = node;
                node = null;
            } else {
                //否则，继续遍历右子树
                node = node.right;
            }
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
