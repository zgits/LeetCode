package Breadth_first_Search;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description:
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/26 19:28.
 */
public class L_101 {
    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode t1=queue.poll();
            TreeNode t2=queue.poll();
            if(t1==null&&t2==null) continue;
            if(t1==null||t2==null) return false;
            if(t1.val!=t2.val) return false;

            queue.add(t1.left);
            queue.add(t2.right);
            queue.add(t1.right);
            queue.add(t2.left);
        }

        return true;
    }
}
