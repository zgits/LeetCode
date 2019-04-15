package tree;

/**
 * @Author: zjf
 * @Date: 2019/4/15 11:46
 * @Description: 104. 二叉树的最大深度
 */
public class L_104 {
    public int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }
        //当前结点深度等于左右子树较大的+1
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
