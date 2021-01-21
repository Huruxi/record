package cn.hrd.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *  从上到下打印二叉树
 *
 *  I. 按层打印： 题目要求的二叉树的 从上至下 打印（即按层打印），又称为二叉树的 广度优先搜索（BFS）。BFS 通常借助 队列 的先入先出特性来实现。
 *
 *  II. 每层打印到一行： 将本层全部节点打印到一行，并将下一层全部节点加入队列，以此类推，即可分为多行打印。
 *
 * @author hrd <br/>
 * @date 2021/1/21
 */
public class TreeLevelOrder {


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

        TreeLevelOrder levelOrder = new TreeLevelOrder();
//        List<List<Integer>> lists = levelOrder.levelOrder(root);
        int[] integers = levelOrder.levelOrder0(root);

        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }

    }

    /**
     * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
     * @param root
     * @return
     */
    public int[] levelOrder0(TreeNode root) {
        if(root == null){
            return new int[0];
        }

        List<Integer> list = new ArrayList<Integer>();
        LinkedList linkedList = new LinkedList();
        linkedList.offer(root);

        while (!linkedList.isEmpty()){
            TreeNode node = (TreeNode)linkedList.poll();

            if(node.left != null){
                linkedList.offer(node.left);
            }

            if(node.right != null){
                linkedList.offer(node.right);
            }

            list.add(node.val);
        }

        int[] data  = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            data[i] = list.get(i);
        }

        return data;
    }

    /**
     * 算法流程：
     *  特例处理： 当根节点为空，则返回空列表 [] ；
     *
     *  初始化： 打印结果列表 res = [] ，包含根节点的队列 queue = [root] ；
     *
     *  BFS 循环： 当队列 queue 为空时跳出；
     *
     *      新建一个临时列表 tmp ，用于存储当前层打印结果；
     *      当前层打印循环： 循环次数为当前层节点数（即队列 queue 长度）；
     *          出队： 队首元素出队，记为 node；
     *          打印： 将 node.val 添加至 tmp 尾部；
     *          添加子节点： 若 node 的左（右）子节点不为空，则将左（右）子节点加入队列 queue ；
     *
     *      将当前层结果 tmp 添加入 res 。
     *
     *  返回值： 返回打印结果列表 res 即可。
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<List<Integer>>();
        }

        LinkedList linkedList = new LinkedList();
        linkedList.offer(root);
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        while (!linkedList.isEmpty()){
            List<Integer> integers = new ArrayList<Integer>();

            for (int i = linkedList.size(); i > 0; i--) {
                TreeNode node = (TreeNode)linkedList.poll();
                integers.add(node.val);

                if(node.left != null){
                    linkedList.offer(node.left);
                }

                if(node.right != null){
                    linkedList.offer(node.right);
                }
            }

            if(integers.size() > 0) {
                list.add(integers);
            }
        }

        return list;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        List<List<Integer>> res = new ArrayList();
        if(root != null) queue.add(root);

        while(!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList();

            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

            res.add(tmp);
        }

        return res;
    }


}
