package Binary_Search;

/**
 * @Description: 69. x 的平方根,二分查找
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/21 12:05.
 */
public class L_69 {
    public static int mySqrt(int x) {
//        未完成
        int left=1,right=((x>>1)+1);;
        while (left<=right) {
            int mid=left+((right-left)>>1);
            if (mid>(Integer.MAX_VALUE/mid)) {
                right=mid-1;
                continue;
            }
            int result=mid*mid;
            if (result==x) {
                return mid;
            } else if (result>x) {
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        if (left*left==x) {
            return left;
        } else
            return left-1;
    }


    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
