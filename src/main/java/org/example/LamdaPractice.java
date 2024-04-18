package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LamdaPractice {
    public static void main(String[] args) {


        List<Integer> numbers= Arrays.asList(8,6,5,3,6,13,11,9,34);
        numbers.stream().filter(n->n>5).sorted().collect(Collectors.toList()).forEach(System.out::println);

String [] s={"india","africa","america","london","pakistan","india"};
        List<String> words=Arrays.asList(s);
      Set<String> sortedset=  words.stream().collect(Collectors.toSet());
        System.out.println(words);
        String s1="hellow world i am ratna";
        String s2=new String(" java is super");

        s1=s1.replace(" ","");
        String [] word=s2.trim().split("\\s+");
        System.out.println(s1.length()+"-------------"+word.length);

    }
}
