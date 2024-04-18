package org.example;

import java.util.Arrays;

public class MaxSumSubArray {


    public static void main(String[] args) {

        String input = "129985478";
        int count1=0,count2=0;
        int [] num=new int[input.length()];
        for(char c:input.toCharArray()){
            num[count1]=Character.getNumericValue(c);
            count1++;
        }

        int [] sum=new int[num.length-2];
         for (int i=0;i<num.length-2;i++){
             int  subarray[]=Arrays.copyOfRange(num,i,i+3);

             sum[i]= Arrays.stream(subarray).sum();

                 System.out.println("sum array" + Arrays.toString(subarray)+""+sum[i]);

         }

            Arrays.sort(sum);
        System.out.println(sum[sum.length-1]);
    }

}
