package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class StringPractice {

static HashMap<Character,Integer> map=new HashMap<>();


    public static void main(String[] args) {
        String s="hello worl@,d";
        StringPractice sp=new StringPractice();
        String vowels="1234567890";

        for(Character c:s.trim().replaceAll(" ","").toCharArray()){
            if(vowels.indexOf(c)!=-1)
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1)
            System.out.println("duplicate characters and respective values are"+entry.getKey()+"-----"+entry.getValue());

        }
        System.out.println(s.substring(s.indexOf("h")+1,s.indexOf("@")-1));


    }
}
