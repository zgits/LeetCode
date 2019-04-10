package greedy;
//贪心算法

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 874. 模拟行走机器人
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/4/10 18:37.
 */
public class L_874 {
    public int robotSim(int[] commands, int[][] obstacles) {

        int result=0;
        int[][] dx={{0,1},{1,0},{0,-1},{-1,0}};//代表上，右，下，左
        Map<String,Boolean> map=new HashMap<>();
        for (int i = 0; i < obstacles.length; i++) {
            map.put(obstacles[i][0]+","+obstacles[i][1],true);
        }
        int x=0;
        int y=0;
        int d=0;//记录方向
        for (int command : commands) {
            if(command==-1){
                //向右转90度
                d=(d+1)%4;
            }else if(command==-2){
                d=(d+4-1)%4;
            }else{
                for (int i = 0; i < command; i++) {
                    if(map.containsKey((x+dx[d][0])+","+(y+dx[d][1]))){
                        break;
                    }
                    x+=dx[d][0];
                    y+=dx[d][1];
                }
                result=Math.max(result,x*x+y*y);
            }
        }
        return result;
    }
}
