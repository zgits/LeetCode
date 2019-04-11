package greedy;

import java.util.Arrays;

/**
 * @Author: zjf
 * @Date: 2019/4/11 10:42
 * @Description: 1005. K 次取反后最大化的数组和
 */
public class L_1005 {
    public int largestSumAfterKNegations(int[] A, int K) {

        for(int i=1;i<=K;i++){
            Arrays.sort(A);
            A[0]=-1*A[0];
        }
        int result=0;
        for (int i = 0; i < A.length; i++) {
            result+=A[i];
        }
        return result;
    }

}
