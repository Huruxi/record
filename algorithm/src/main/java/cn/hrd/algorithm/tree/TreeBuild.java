package cn.hrd.algorithm.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 重建二叉树
 * @author hrd <br/>
 * @date 2021/2/4
 */
public class TreeBuild {

    public static void main(String[] args) {

        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeBuild build = new TreeBuild();
        TreeNode treeNode = build.buildTree(preorder, inorder);

        LinkedList<TreeNode> list = new LinkedList();
        list.offer(treeNode);

        while (!list.isEmpty()){
            TreeNode poll = list.poll();
            System.out.print(poll.val + " ");

            if(poll.left != null){
                list.offer(poll.left);
            }

            if(poll.right != null){
                list.offer(poll.right);
            }
        }
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int length = preorder.length;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        int inorderIndex = 0;

        for (int i = 1; i < length; i++) {
            int preorderVal = preorder[i];
            TreeNode node = stack.peek();

            if (node.val != inorder[inorderIndex]) {
                node.left = new TreeNode(preorderVal);
                stack.push(node.left);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                    node = stack.pop();
                    inorderIndex++;
                }

                node.right = new TreeNode(preorderVal);
                stack.push(node.right);
            }
        }

        return root;
    }


    int[] preorder;
    HashMap<Integer, Integer> dic = new HashMap();
    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for(int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }

        return recur(0, 0, inorder.length - 1);
    }

    TreeNode recur(int root, int left, int right) {
        if(left > right) {
            return null; // 递归终止
        }

        TreeNode node = new TreeNode(preorder[root]);          // 建立根节点
        int i = dic.get(preorder[root]);                       // 划分根节点、左子树、右子树
        node.left = recur(root + 1, left, i - 1);              // 开启左子树递归
        node.right = recur(root + i - left + 1, i + 1, right); // 开启右子树递归
        return node;                                           // 回溯返回根节点
    }

}
