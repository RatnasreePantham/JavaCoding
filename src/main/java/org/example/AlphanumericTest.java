package org.example;

public class AlphanumericTest {
    public static void main(String[] args) {
        String s="aaabbbccaa";
        String word="abc1230@%4z";
StringBuffer result=new StringBuffer();
        for(char c:word.toCharArray()){
            if(Character.isLetter(c)){
                char ch=c= (char)(c+1);
                if(c >'z'){
                    ch='a';
                }
                result.append(ch);

            }else if(Character.isDigit(c)){

               result.append(Character.getNumericValue(c)+1%10);
            }
            else{
                result.append(c);
            }

        }
        System.out.println(result);
    }
}
