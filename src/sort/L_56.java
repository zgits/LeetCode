package sort;

import java.util.*;

/**
 * @Description: leetcode上有关排序的第56题，合并区间
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/20 13:32.
 */
public class L_56 {
    public List<Interval> merge(List<Interval> intervals) {
        //解题思路，先进行排序，从小到大，排序完成后，一个挨着一个比较，
        //前一个的end比较后一个的start，如果end大于start，代表是需要合并的，
//        取两个end中的最大值，然后移除后面个，接着比较
//        如果小于，两个不能合并，下标加1后移
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });

        int index=0;
        Interval i1,i2;
        while (index<intervals.size()-1){
            i1=intervals.get(index);
            i2=intervals.get(index+1);
            if (i1.end>=i2.start){
                i1.end=Math.max(i1.end,i2.end);
                intervals.remove(index+1);
            }else{
                index++;
            }
        }
        return intervals;
    }

}
//预先定义的
class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
 }
