package greedy;

/**
 * @Author: zjf
 * @Date: 2019/12/18 21:20
 * @Description: 1221. 分割平衡字符串
 */
public class L_1221 {

    public int balancedStringSplit(String s) {

        int result = 0;
        if (s.length() <= 1) {
            return result;
        }
        int value=0;
        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='L'){
                value++;
            }else if(chars[i]=='R'){
                value--;
            }
            if (value==0){
                result++;
            }

        }
        return result;
    }
}
