package Depth_first_Search;

/**
 * @Description: 100.相同的数
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/25 13:48.
 */
public class L_100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null&&q==null){
            return true;
        }
        if(p==null&&q!=null||p!=null&&q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
