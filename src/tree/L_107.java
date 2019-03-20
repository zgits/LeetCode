package tree;

import java.util.*;

/**
 * @Description:  leetcode 107题： 二叉树的层次遍历 II
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/20 16:33.
 */
public class L_107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

//        用队列和栈来完成，首先队列添加到根元素，外循环根据队列是否为空，内循环根据size来循环，获得根元素的值放入list中，
//        获得队首元素，并移除，poll()方法，之后将根元素的左右节点依次放入队列中
//        size-1，内循环结束之后，继续外循环，循环结束后，根据栈的特性，先入后出，之后就是从栈中依次弹出结果
        List<List<Integer>> result=new ArrayList<>();

        Queue<TreeNode> q=new LinkedList<>();
        Stack<List<Integer>> stack=new Stack<>();
        if(root==null){
            return result;
        }
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            while (size>0){
                TreeNode temp=q.poll();
                list.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                size--;
            }
            stack.push(list);

        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }

        return result;

    }
}
