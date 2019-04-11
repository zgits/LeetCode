package greedy;

/**
 * @Description: 944.删造序列
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/4/10 20:07.
 */
public class L_944 {
    public int minDeletionSize(String[] A) {

        /**
         * 统计有多少个非升序列
         */
        if(A.length==0){
            return 0;
        }
        int result=0;//
        for (int j = 0; j < A[0].length(); j++) {
            for (int i=0;i<A.length-1;i++){
                if (A[i].charAt(j)>A[i+1].charAt(j)){
                    result++;
                    break;
                }
            }

        }


        return result;
    }
}
