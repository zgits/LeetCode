package stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: zjf
 * @Date: 2019/4/8 15:46
 * @Description: 225. 用队列实现栈
 */
public class L_225 {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    /** Initialize your data structure here. */
//    类的原名是MyStack
    public L_225() {
        this.queue1=new LinkedList<>();
        this.queue2=new LinkedList<>();

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue2=queue1;
        queue1=new LinkedList<>();
        queue1.offer(x);
        while (!queue2.isEmpty()){
            queue1.offer(queue2.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {

        return queue1.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}
