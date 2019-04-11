package sort;

/**
 * @Author: zjf
 * @Date: 2019/4/11 10:56
 * @Description: 922. 按奇偶排序数组 II
 */
public class L_922 {
    public int[] sortArrayByParityII(int[] A) {
        int[] result=new int[A.length];
        int a=0;//分别代表偶数索引和奇数索引
        int b=1;
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2==0){
                //代表偶数，偶数索引存放后+2
                result[a]=A[i];
                a+=2;
            }else{
                //代表是奇数，奇数索引存放后+2
                result[b]=A[i];
                b+=2;
            }
        }
        return result;

    }
}
