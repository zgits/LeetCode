package heap;

import java.util.PriorityQueue;

/**
 * @Author: zjf
 * @Date: 2019/4/8 17:38
 * @Description: 703. 数据流中的第K大元素
 */
public class L_703 {

    /**
     * 原题的类名为：KthLargest
     * @param k
     * @param nums
     */
    final PriorityQueue<Integer> pq;
    final int k;
    public L_703(int k, int[] nums) {

        this.k=k;
        pq=new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);//对传进来的int数组遍历
        }
    }

    public int add(int val) {

        if(pq.size()<k){
            pq.offer(val);//如果队列中的数量少于K，直接添加入优先队列，优先队列会自动维持小顶堆
        }else{
            if(pq.peek()<val){//否则队列中的数量大于或者等于K，优先队列中的最小数字小于新的数据，优先队列中的顶堆要被移除，并且添加入新的数据进优先队列
                pq.poll();
                pq.offer(val);
            }
        }
        return pq.peek();//返回当前第K大的数
    }
}
