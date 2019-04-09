package greedy;

/**
 * @Author: zjf
 * @Date: 2019/4/9 15:12
 * @Description: 860. 柠檬水找零
 */
public class L_860 {
    public boolean lemonadeChange(int[] bills) {


        int five=0;
        int ten=0;
        for (int i = 0; i <bills.length ; i++) {
            if(bills[i]==5){
                five++;
            }else if(bills[i]==10){
                if(five<=0){
                    return false;
                }
                five--;
                ten++;
            }else{
                if(ten>0&&five>0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }
            }

        }
        return true;
    }
}
