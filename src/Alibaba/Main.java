package Alibaba;

/**
 * @Description: 阿里巴巴模拟附加题
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/4/9 19:49.
 */
import java.util.*;
import java.util.List;
public class Main {
/** 请完成下面这个函数，实现题目要求的功能 **/
    /**
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来
     **/
    public static String measureDistance(List<Double> xList, List<Double> yList, double x, double y) {

        boolean flag = false;
        //
        for (int i = 0, l = xList.size(), j = l - 1; i < l; j = i, i++) {
            //取出边界的相邻两个点
            double sx = xList.get(i),
                    sy = yList.get(i),
                    tx = xList.get(j),
                    ty = yList.get(j);
            // 点与多边形顶点重合
            if ((sx == x && sy ==y) || (tx == x && ty == y)) {
                flag=true;
                break;
            }
            // 判断线段两端点是否在射线两侧
            //思路:作p点平行于y轴的射线 作s,t的平行线直线  如果射线穿过线段，则py的值在sy和ty之间
            if ((sy < y && ty >= y) || (sy >= y && ty < y)) {
                // 线段上与射线 Y 坐标相同的点的 X 坐标 ,即求射线与线段的交点
                double x1 = sx + (y - sy) * (tx - sx) / (ty - sy);
                // 点在多边形的边上
                if (x1 == x) {
                    flag=true;
                    break;
                }
                // 射线穿过多边形的边界
                if (x1 > x) {
                    flag = !flag;
                }
            }
        }
        if(flag){
            return "yes,0";
        }else{
            double result=Math.sqrt((x-xList.get(0))*(x-xList.get(0))+(y-yList.get(0))*(y-yList.get(0)));
            for(int i=0;i<xList.size();i++){
                double x1=xList.get(i);
                double x2=yList.get(i);
                result= Math.min(Math.sqrt((x-x1)*(x-x1)+(y-x2)*(y-x2)),result);
            }
            int result1= (int) Math.round(result);
            return "no,"+result1;
        }


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        //(x,y)为小广所在的位置
        double x = Double.parseDouble(line.split(",")[0]);
        double y = Double.parseDouble(line.split(",")[1]);

        line = in.nextLine();
        //xList记录了多边形n个点的x坐标,yList记录了多边形n个点的y坐标
        List<Double> xList = new ArrayList<>();
        List<Double> yList = new ArrayList<>();
        String[] array = line.split(",");
        for(int i = 0; i < array.length; i++) {
            xList.add(Double.parseDouble(array[i]));
            yList.add(Double.parseDouble(array[i+1]));
            i++;
        }
        in.close();
        System.out.println(measureDistance(xList, yList, x, y));
    }
}
