package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description: 155. 最小栈
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/27 12:14.
 */
public class L_155 {

    List<Integer> list;
//    构造函数与原题不同
    public L_155() {
        list=new ArrayList<>();
    }

    public void push(int x) {

        list.add(x);

    }

    public void pop() {

        list.remove(list.size()-1);
    }

    public int top() {

        return list.get(list.size()-1);
    }

    public int getMin() {

        return Collections.min(list);
    }
}
