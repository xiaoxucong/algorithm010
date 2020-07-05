package com.algorithm.ok.week_4;

/***
 * 860. 柠檬水找零
 */
public class Water {

    public boolean lemonadeChange(int[] bills) {
        if(bills == null || bills.length < 1) return true;

        int num = 0;
        int y = 0;
        for(int i =0;i < bills.length ;i++) {

            int temp = bills[i];

            if(temp == 5){
                num ++;
            }else if(temp == 10){
                y ++;
                num --;
            }else {

                if( y <1){
                    num = num -3;
                }else {
                    y --;
                    num --;
                }

            }
            if( y < 0 || num < 0) {
                return false;
            }
        }
        return true;

    }
}
