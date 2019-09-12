package hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: zjf
 * @Date: 2019/9/12 22:32
 * @Description: 409. 最长回文串
 */
public class L_409 {

    public int longestPalindrome(String s) {

        if (s.length()==0){
            return 0;
        }
        char[] chars=s.toCharArray();

        int count=0;
        HashSet<Character> characters=new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if(characters.contains(chars[i])){
                characters.remove(chars[i]);
                count++;
            }else{
                characters.add(chars[i]);
            }
        }
        return characters.isEmpty()?count*2:count*2+1;
    }

}
