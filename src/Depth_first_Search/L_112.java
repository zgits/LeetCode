package Depth_first_Search;

/**
 * @Description: 112.路径总和
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/25 15:03.
 */
public class L_112 {
    public boolean hasPathSum(TreeNode root, int sum) {

        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            return sum==root.val;
        }
        if(root.left==null&&root.right!=null){
            return hasPathSum(root.right,sum-root.val);
        }
        if(root.left!=null&&root.right==null){
            return hasPathSum(root.left,sum-root.val);
        }
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
