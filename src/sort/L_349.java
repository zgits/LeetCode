package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zjf
 * @Date: 2019/4/2 13:46
 * @Description: leetcode中的349. 两个数组的交集
 */
public class L_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        /**
         * 解题思路：首先进行排序，之后对两个数组中的每一个元素进行比较
         * 从0下标开始，如果相等，则把该元素加入到结果数组之中，
         * 如果数组1的元素小于数组2的元素，则数组1的下标+1，
         * 反之则数组2的下标加1，最后进行去重的操作
         */
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int start1=0;
        int start2=0;
        int[] result=new int[Math.max(nums1.length,nums2.length)];
        int index=0;
        while (start1<=nums1.length-1&&start2<=nums2.length-1){
            if(nums1[start1]==nums2[start2]){
                result[index]=nums1[start1];
                index++;
                start1++;
                start2++;
            }else if(nums1[start1]<nums2[start2]){
                start1++;
            } else if (nums1[start1]>nums2[start2]) {
                start2++;
            }
        }
        int[] temp=new int[index];
        temp=Arrays.copyOfRange(result,0,index);

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if(!list.contains(temp[i])){
                list.add(temp[i]);
            }
        }
        int[] temp2=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            temp2[i]=list.get(i);
        }
        return temp2;
    }
}
