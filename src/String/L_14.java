package String;

import java.util.Arrays;

/**
 * @Author: zjf
 * @Date: 2019/9/12 22:06
 * @Description: 14. 最长公共前缀
 */
public class L_14 {
    public String longestCommonPrefix(String[] strs) {


        if(strs.length==0){
            return "";
        }
        int len=strs.length;
        Arrays.sort(strs);
        int m=strs[0].length();
        int n=strs[len-1].length();
        int num=Math.min(m,n);
        String result="";
        for (int i=0;i<num;i++){
            if(strs[0].charAt(i) == strs[len - 1].charAt(i)){
                result+=strs[0].charAt(i);
            }else{
                break;
            }
        }
        return result;
    }
}
