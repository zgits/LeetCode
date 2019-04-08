package stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author: zjf
 * @Date: 2019/4/8 16:27
 * @Description: 496. 下一个更大元素
 */
public class L_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for (int i : nums2) {
            while (!stack.isEmpty()&&stack.peek()<i){
                hashMap.put(stack.pop(),i);
            }
            stack.push(i);
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i]=hashMap.getOrDefault(nums1[i],-1);
        }
        return result;
    }
}
