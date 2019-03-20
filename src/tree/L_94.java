package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description: leetcode 94 二叉树的中序遍历
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/20 17:48.
 */
public class L_94 {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list=new ArrayList<>();
        //解法1，递归，容易理解
        // addToList(root,list);
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while (cur!=null||!stack.isEmpty()){
            if(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }else{
                TreeNode treeNode=stack.pop();
                list.add(treeNode.val);
                cur=treeNode.right;
            }
        }

        return list;
    }
    public void addToList(TreeNode t,List<Integer> list){
        if(t==null){
            return ;
        }
        addToList(t.left,list);
        list.add(t.val);
        addToList(t.right,list);
    }
}
//

