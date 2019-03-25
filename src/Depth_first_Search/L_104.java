package Depth_first_Search;

/**
 * @Description: 104. 二叉树的最大深度
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/25 14:47.
 */
public class L_104 {
    public int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return Math.max(l,r)+1;

    }
}
