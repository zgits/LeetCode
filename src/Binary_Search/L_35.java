package Binary_Search;

/**
 * @Description: 二分查找，35. 搜索插入位置 LeetCode
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/21 11:29.
 */
public class L_35 {
    public int searchInsert(int[] nums, int target) {
//二分查找未实现，2019-3-21
        for(int i=0;i<nums.length+1;i++){
            if(i==nums.length){
                return i;
            }
            if(nums[i]>=target){
                return i;
            }
        }
        return 0;


//        int low=0;
//        int high=nums.length-1;
//        int mid=0;
//        if(contains(nums,target)){
//            while (low<high){
//                mid=(low+high)/2;
//                if(nums[mid]==target){
//                    return mid;
//                }
//                if(nums[mid]>target){
//                    high=mid;
//                }else if(nums[mid]==target){
//                    low=mid;
//                }
//            }
//        }else{
//            for(int i=0;i<nums.length;i++){
//                if(nums[i]<target){
//                    mid=i;
//                }else{
//                    break;
//                }
//            }
//        }
//
//        return mid;
    }

    public boolean contains(int nums[],int target){
        for (int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return true;
            }
        }
        return false;
    }
}
