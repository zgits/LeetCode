package stack;

import java.util.Stack;
import java.util.regex.Pattern;

/**
 * @Author: zjf
 * @Date: 2019/4/8 16:45
 * @Description: 682. 棒球比赛
 */
public class L_682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        int result=0;
        for (int i = 0; i < ops.length; i++) {

            if(ops[i].equals("+")){
                if(!stack.isEmpty()){
                    int score2=stack.pop();
                    int score1=stack.peek();
                    stack.push(score2);
                    stack.push(score1+score2);
                }
            }else if(ops[i].equals("D")){
                stack.push(stack.peek()*2);
            }else if(ops[i].equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(ops[i]));
            }
        }

        while (!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }
}
