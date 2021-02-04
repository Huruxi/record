package cn.hrd.algorithm.tree;

import java.util.LinkedList;

/**
 *
 * 最大二叉树
 * @author hrd <br/>
 * @date 2021/2/3
 */
public class TreeConstructMaximumBinary  {

    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};

        TreeConstructMaximumBinary maximumBinary = new TreeConstructMaximumBinary();
        maximumBinary.constructMaximumBinaryTree(nums);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        TreeNode node = construct(nums, 0, nums.length);

        if(node != null){
            LinkedList<TreeNode> list = new LinkedList();
            list.offer(node);

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
        return null;
    }


    //本方法非常简单。创建方法 construct(nums, l, r)，用于找出在数组 numsnums 中从 ll 到 rr 索引（不包含第 rr 个位置）中最大二叉树的根节点。
    //
    //算法步骤如下：
    //
    //首先调用 construct(nums, 0, n)，其中 nn 是数组 numsnums 的长度。
    //
    //在索引范围 (l:r-1)(l:r−1) 内找到最大值的索引，将 nums[max\_i]nums[max_i] 作为根节点。
    //
    //调用 construct(nums, l, max_i) 创建根节点的左孩子。递归执行此操作，创建根节点的整个左子树。
    //
    //类似的，调用 construct(nums, max_i + 1, r) 创建根节点的右子树。
    //
    //方法 construct(nums, 0, n) 返回最大二叉树的根节点。
    private TreeNode construct(int[] nums,int l, int r){

        if(l == r){
            return null;
        }

        int max_i = max(nums,l,r);
        TreeNode root = new TreeNode(nums[max_i]);
        root.left = construct(nums,l,max_i);
        root.right = construct(nums,max_i + 1,r);
        return root;
    }

    private int max(int[] nums,int l, int r){
        int max_i = l;

        for (int i = l; i < r; i++) {
            if(nums[i] > nums[max_i]){
                max_i = i;
            }
        }

        return max_i;
    }

}
