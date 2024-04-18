package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;

public class TernaryExample {


    public static void main(String[] args) {

        String input = "abc735"; // Replace with your actual input string
        StringBuilder letters=new StringBuilder();
        StringBuilder numbers=new StringBuilder();
        for(char c:input.toCharArray()){
           if(Character.isLetter(c)){
               letters.append(c);
           }
           else {
               numbers.append(c);
           }
        }
int count=0;
        int[] x=new int[3];
        for(char ch:numbers.toString().toCharArray()) {
            x[count]=Character.getNumericValue(ch);
            count ++;
        }
        int i[]={3,4,1,4,3,2,6};
String s1="3,4,1,4,3,2,6";
s1=s1.replace(",","");
int counter=0;
        int[] num=new int[s1.length()];
for(char ch:s1.toCharArray()) {

   num [counter]  = Character.getNumericValue(ch);
    counter++;
}
Integer.valueOf(input);
//        Arrays.sort(i);
        Arrays.binarySearch(i,3);

        System.out.println(i[i.length-1]);
int sum[]=new int[i.length-2];
        for(int a=0;a<i.length-2;a++) {
            int sub[] = Arrays.copyOfRange(i, a, a + 3);
            sum[a]=Arrays.stream(sub).sum();
            System.out.println("sum of array"+Arrays.stream(sub).sum());
        }
Arrays.sort(sum);
        System.out.println(Arrays.stream(sum).count());
        System.out.println( sum[sum.length-1]);
        for(int temp:sum){
            System.out.println(temp);
        }
//     int max=   (i[0]>i[1])?((i[0]>i[2])?i[0]:i[2]):(((i[1]>i[2])?i[1]:i[2]));
//        System.out.println("max value :"+max);
    }

}
