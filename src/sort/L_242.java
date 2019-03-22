package sort;

import java.util.Arrays;

/**
 * @Description: 242. 有效的字母异位词
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/22 22:07.
 */
public class L_242 {
    public boolean isAnagram(String s, String t) {

      if(s.length()!=t.length()){
          return false;
      }
      char[] as=s.toCharArray();
      char[] bt=t.toCharArray();
        Arrays.sort(as);
        Arrays.sort(bt);
        return Arrays.equals(as,bt);
    }

}

