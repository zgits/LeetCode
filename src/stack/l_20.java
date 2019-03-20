package stack;

import java.util.Stack;

/**
 * @Description: LeetCode上的第20题，有效的括号
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/20 13:19.
 */
public class l_20 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[] chars=s.toCharArray();
        for (char aChar : chars) {
            if(stack.isEmpty()){
                stack.push(aChar);
            }else if(isSys(stack.peek(),aChar)){

                stack.pop();
            }else{
                stack.push(aChar);
            }
        }
        return stack.isEmpty();
    }
    private boolean isSys(char c1,char c2){
        return (c1=='('&&c2==')')||(c1=='['&&c2==']')||(c1=='{'&&c2=='}');
    }
}
