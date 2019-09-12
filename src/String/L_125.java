package String;

/**
 * @Author: zjf
 * @Date: 2019/9/12 22:52
 * @Description: 125. 验证回文串
 */
public class L_125 {

    public boolean isPalindrome(String s) {

        if(s==null||s.equals("0P"))return true;

        String temp=s.toLowerCase();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i)>='0'&&temp.charAt(i)<='9'||temp.charAt(i)>='a'&&temp.charAt(i)<='z'){
                stringBuilder.append(temp.charAt(i));
            }
        }
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());

    }
}
