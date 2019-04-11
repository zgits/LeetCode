package tree;

/**
 * @Author: zjf
 * @Date: 2019/4/11 12:51
 * @Description: 101. 对称二叉树
 */
public class L_101 {
    public boolean isSymmetric(TreeNode root) {

//        未通过
        if(root==null){
            return true;
        }
        if(root.left.left.val==root.right.right.val){
            return true;
        }
        return isSymmetric(root.left)&&isSymmetric(root.right);
    }
}
