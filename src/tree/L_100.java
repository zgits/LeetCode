package tree;

/**
 * @Author: zjf
 * @Date: 2019/4/11 12:40
 * @Description: 100. 相同的树
 */
public class L_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if((p!=null&&q==null)||(p==null&&q!=null)){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }


        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
