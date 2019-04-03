package Binary_Search;

/**
 * @Author: zjf
 * @Date: 2019/4/3 17:26
 * @Description: 367. 有效的完全平方数
 */
public class L_367 {
    public boolean isPerfectSquare(int num) {

        if(num==1){
            return true;
        }
        int start=0;
        int end=num;
        int mid;
        while (start<=end){
            mid=(start+end)/2;
            if(mid==num*1.0/mid){
                return true;
            }else if(mid>num*1.0/mid){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}
