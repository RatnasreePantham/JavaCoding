package org.example;

import java.util.HashMap;
import java.util.Map;

public class TriangleStars {

static HashMap<Character,Integer> map=new HashMap<>();


    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*"+ " ");
            }
            System.out.print("\n");
        }


        String s1="hello1";
        String s2="world";

        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println(s2+"-----"+s1);
//
//
//        String s="abbcaaddbb";
//        int count=1;
//
StringBuilder sb=new StringBuilder();
//        for(int i=1;i<s.length()-1;i++) {
//            if(s.charAt(i-1)==s.charAt(i)){
//                count++;
//            }
//            else{
//                sb.append(count).append(s.charAt(i-1));
//                count=1;
//            }
//        }
//        System.out.println(sb);
//
//        String s="64hvsdhaeiohoefy47d8";
//        HashMap<Character,Integer> map=new HashMap<>();
//        String vowels="aeiou";
//        for(char c:s.toCharArray()) {
//            if (vowels.indexOf(c)!=-1){
//                map.put(c,map.getOrDefault(c,0)+1);
//            }
//        }
//        for(Map.Entry<Character,Integer> entry:map.entrySet()){
//            System.out.println(entry.getKey()+"-------"+entry.getValue());
//        }

        String s="hai i am  ratnasree";
        String rev="";
        String [] words=s.split("\\s+");
        for (String word:words){
            for (char c:word.toCharArray()) {
            rev=c+rev;
            }
        }
        System.out.println(rev.trim());
    }
}
