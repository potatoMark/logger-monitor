package com.numi.io.common;

import java.math.BigDecimal;
import java.util.Arrays;

public class MathUtils {

    /**
     * 四分位算法
     　　　*@param arr 长度为n的数组
     　　　*@return quartiles Q1/Q2/Q3数组
     **/
    public static double[] getQuartiles(double[] arr) {
        double[] arr1 = new double[4];
        // 长度小于4时,补齐arr数组至长度四位
        if (arr.length < 4) {
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];
            }
            for (int k = arr.length; k < 4; k++) {
                arr1[k] = arr1[k];
            }
            return arr1;
        }
        double[] tempArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(tempArr);
        double[] quartiles = new double[3];

        int n = arr.length;
        double Q1 = (n+1) * 0.25D;
        double Q2 = (n+1) * 0.5D;
        double Q3 = (n+1) * 0.75D;
        //Q1
        if(Q1 % 2 == 0){
            quartiles[0] = tempArr[(int)Q1];
        }else{
            double Q1y = Q1-Math.floor(Q1);
            double Q1r;
            Q1r = (1D - Q1y) * tempArr[(int) Math.floor(Q1)-1] + Q1y * tempArr[(int) Math.ceil(Q1)-1];
            quartiles[0] = Q1r;
        }
        //Q2
        if(Q2 % 2 == 0){
            quartiles[1] = tempArr[(int)Q2];
        }else{
            double Q2y = Q2-Math.floor(Q2);
            double Q2r;
            Q2r = (1D - Q2y) * tempArr[(int) Math.floor(Q2)-1] + Q2y * tempArr[(int) Math.ceil(Q2)-1];
            quartiles[1] = Q2r;
        }
        //Q3
        if(Q3 % 2 == 0){
            quartiles[2] = tempArr[(int)Q3];
        }else{
            double Q3y = Q3-Math.floor(Q3);
            double Q3r;
            Q3r = (1D - Q3y) * tempArr[(int) Math.floor(Q3)-1] + Q3y * tempArr[(int) Math.ceil(Q3)-1];
            quartiles[2] = Q3r;
        }
        return quartiles;
    }

    public static BigDecimal[] fourDivsion(BigDecimal[] param){

        BigDecimal[] quartiles = new BigDecimal[3];

        BigDecimal[] arr = new BigDecimal[4];
        // 长度小于4时,补齐arr数组至长度四位
        if (param.length < 4) {
            for (int i = 0; i < param.length; i++) {
                arr[i] = param[i];
            }
            for (int k = param.length; k < 4; k++) {
                arr[k] = arr[k];
            }
            return arr;
        }
        // 转成BigDecimal类型，避免失去精度
        BigDecimal[] datas = new BigDecimal[param.length];
        for(int i=0; i<param.length; i++){
            datas[i] = param[i];
        }
        int len = datas.length;// 数组长度
        Arrays.sort(datas);    // 数组排序，从小到大
        BigDecimal q1 = null;  // 第一四分位
        BigDecimal q2 = null;  // 第二四分位
        BigDecimal q3 = null;  // 第三四分位
        int index = 0; // 记录下标
        // n代表项数，因为下标是从0开始所以这里理解为：len = n+1
        if(len%2 == 0){ // 偶数
            index = new BigDecimal(len).divide(new BigDecimal("4")).intValue();
            q1 = datas[index-1].multiply(new BigDecimal("0.25")).add(datas[index].multiply(new BigDecimal("0.75")));
            q2 = datas[len/2].add(datas[len/2-1]).divide(new BigDecimal("2"));
            index = new BigDecimal(3*(len+1)).divide(new BigDecimal("4")).intValue();
            q3 = datas[index-1].multiply(new BigDecimal("0.75")).add(datas[index].multiply(new BigDecimal("0.25")));
        }else{ // 奇数
            q1 = datas[new BigDecimal(len).multiply(new BigDecimal("0.25")).intValue()];
            q2 = datas[new BigDecimal(len).multiply(new BigDecimal("0.5")).intValue()];
            q3 = datas[new BigDecimal(len).multiply(new BigDecimal("0.75")).intValue()];
        }
        // 保留两位小数（四舍五入），输出到控制台
        System.out.println(q1.setScale(2, BigDecimal.ROUND_HALF_UP)+" "+
                q2.setScale(2, BigDecimal.ROUND_HALF_UP)+" "+
                q3.setScale(2, BigDecimal.ROUND_HALF_UP));
        quartiles[0] = q1.setScale(2, BigDecimal.ROUND_HALF_UP);
        quartiles[1] = q2.setScale(2, BigDecimal.ROUND_HALF_UP);
        quartiles[2] = q3.setScale(2, BigDecimal.ROUND_HALF_UP);
        return quartiles;
    }
}
