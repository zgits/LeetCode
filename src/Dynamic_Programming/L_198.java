package Dynamic_Programming;

/**
 * @Description: 198. 打家劫舍
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/21 21:55.
 */
public class L_198 {
    public int rob(int[] nums) {
        int result=0;
        if (nums.length==0){
            return result;
        }
        if (nums.length==1){
            result+=nums[0];
            return  result;
        }
        if(nums.length==2){
            result=Math.max(nums[0],nums[1]);
            return result;
        }
        int[] sum=new int[nums.length];

        sum[0]=nums[0];
        sum[1]=Math.max(nums[1],nums[0]);


        for (int i = 2; i < nums.length; i++) {
            sum[i]=Math.max(nums[i]+sum[i-2],sum[i-1]);
        }
        return sum[nums.length-1];

    }
}
