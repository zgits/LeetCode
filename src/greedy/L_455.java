package greedy;

import java.util.Arrays;

/**
 * @Author: zjf
 * @Date: 2019/4/9 14:50
 * @Description: 455. 分发饼干
 */
public class L_455 {
    public int findContentChildren(int[] g, int[] s) {
        int result=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while (i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                result++;
                i++;
                j++;
            }else{
                j++;
            }
        }

        return result;
    }
}
