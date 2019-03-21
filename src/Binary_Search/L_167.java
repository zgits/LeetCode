package Binary_Search;

/**
 * @Description: 167. 两数之和 II - 输入有序数组
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/21 13:18.
 */
public class L_167 {
//    双指针思路，原本就是升序的数组，从第一个与最后一个相加，如果两数相加大于目标值，表明最后一个数过大，end下标-1，
//    反之start+1
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int start=0;
        int end=numbers.length-1;
        while (start<=end){
            int temp=numbers[start]+numbers[end];
            if(temp==target){
                result[0]=start+1;
                result[1]=end+1;
                break;
            }else if(temp>target){
                end=end-1;
            }else{
                start=start+1;
            }
        }
        return result;
    }
}
