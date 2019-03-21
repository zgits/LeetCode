package Dynamic_Programming;

/**
 * @Description: 70. 爬楼梯
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/21 17:53.
 */
public class L_70 {
//    提取结果可以发现是一个斐波拉契数列
    public int climbStairs(int n) {

        if(n<=2){
            return n;
        }
        int[] result=new int[n];
        result[0]=1;
        result[1]=2;
        for (int i = 2; i < result.length; i++) {
            result[i]=result[i-1]+result[i-2];
        }
        return result[n-1];
    }
}
