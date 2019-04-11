package sort;

import java.util.Arrays;

/**
 * @Author: zjf
 * @Date: 2019/4/11 11:41
 * @Description: 976. 三角形的最大周长
 */
public class L_976 {
    public int largestPerimeter(int[] A) {

        Arrays.sort(A);
        for (int i=A.length-3;i>=0;i--){
            if(A[i+1]+A[i]>A[i+2]){
                return A[i+1]+A[i]+A[i+2];
            }
        }
        return 0;
    }
}
