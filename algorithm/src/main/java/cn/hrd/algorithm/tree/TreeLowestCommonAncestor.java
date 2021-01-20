package cn.hrd.algorithm.tree;

/**
 * 二叉树的最近公共祖先
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，
 * 最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * 示例 1:
 *
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出: 3
 * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
 * 示例 2:
 *
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * 输出: 5
 * 解释: 节点 5 和节点 4 的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。
 *
 * @author hrd <br/>
 * @date 2021/1/20
 */
public class TreeLowestCommonAncestor {
    //递归解析：
    //终止条件：
    //      当越过叶节点，则直接返回 nullnull ；
    //      当 rootroot 等于 p, qp,q ，则直接返回 rootroot ；

    //递推工作：
    //      开启递归左子节点，返回值记为 leftleft ；
    //      开启递归右子节点，返回值记为 rightright ；

    //返回值： 根据 leftleft 和 rightright ，可展开为四种情况；
    //          当 leftleft 和 rightright 同时为空 ：说明 rootroot 的左 / 右子树中都不包含 p,qp,q ，返回 nullnull ；
    //          当 leftleft 和 rightright 同时不为空 ：说明 p, qp,q 分列在 rootroot 的 异侧 （分别在 左 / 右子树），因此 rootroot 为最近公共祖先，返回 rootroot ；
    //          当 leftleft 为空 ，rightright 不为空 ：p,qp,q 都不在 rootroot 的左子树中，直接返回 rightright 。具体可分为两种情况：
    //              p,qp,q 其中一个在 rootroot 的 右子树 中，此时 rightright 指向 pp（假设为 pp ）；
    //              p,qp,q 两节点都在 rootroot 的 右子树 中，此时的 rightright 指向 最近公共祖先节点 ；
    //          当 leftleft 不为空 ， rightright 为空 ：与情况 3. 同理；

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.left.left.left = new TreeNode(1);

        TreeLowestCommonAncestor commonAncestor = new TreeLowestCommonAncestor();
        TreeNode treeNode = commonAncestor.lowestCommonAncestor(root, root.left.left.left, root.left.right);
        System.out.println(treeNode.val);

    }

    /**
     * 二叉树
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        // 如果树为空，直接返回null
        if(root == null){
            return null;
        }

        //// 如果 p和q中有等于 root的，那么它们的最近公共祖先即为root（一个节点也可以是它自己的祖先）
        if(root.val == p.val || root.val == q.val){
            return root;
        }

        // 递归遍历左子树，只要在左子树中找到了p或q，则先找到谁就返回谁
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        // 递归遍历右子树，只要在右子树中找到了p或q，则先找到谁就返回谁
        TreeNode rigth = lowestCommonAncestor(root.right, p, q);

        // 当 left和 right均不为空时，说明 p、q节点分别在 root异侧, 最近公共祖先即为 root
        if(left != null && rigth != null){
            return root;
        }

        //如果在左子树中 p和 q都找不到，则 p和 q一定都在右子树中，右子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
        if(left == null){
            return rigth;
        }

        // 如果 left不为空，在左子树中有找到节点（p或q），这时候要再判断一下右子树中的情况，如果在右子树中，p和q都找不到，则 p和q一定都在左子树中，左子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
        return left;
    }


    /**
     * 搜索二叉树
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val < p.val && root.val < q.val)
            return lowestCommonAncestor2(root.right, p, q);
        if(root.val > p.val && root.val > q.val)
            return lowestCommonAncestor2(root.left, p, q);
        return root;
    }

    /**
     * 搜索二叉树
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor3(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null) {
            if(root.val < p.val && root.val < q.val) // p,q 都在 root 的右子树中
                root = root.right; // 遍历至右子节点
            else if(root.val > p.val && root.val > q.val) // p,q 都在 root 的左子树中
                root = root.left; // 遍历至左子节点
            else break;
        }
        return root;
    }













}
