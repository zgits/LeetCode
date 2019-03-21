package Dynamic_Programming;

/**
 * @Description: 动态规划 53. 最大子序和
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/21 16:48.
 */
public class L_53 {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int now=nums[0];
        for(int i=0;i<nums.length;i++){
            if(now<0){
                now=nums[i];
            }
            else{
                now+=nums[i];
            }
            if(now>sum){
                sum=now;
            }

        }
        return sum;
    }
}
