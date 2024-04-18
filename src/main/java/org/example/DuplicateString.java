package org.example;



public class DuplicateString {
    public static void main(String[] args) {
        int a[]={2,3,1,4,6,5};
        String s="aaabbbaaccddaaa";
        StringBuilder sp=new StringBuilder();
        int count=1,temp = 0;
      for(int i=0;i<s.length()-1;i++){
          if(s.charAt(i)==s.charAt(i+1)){
              count++;
          }else{
              sp.append(count).append(s.charAt(i-1));
              count=1;
          }

      }
        System.out.println(sp);
        System.out.println(Integer.MIN_VALUE);

        for(int x:a) {
            temp += x;
        }
        System.out.println(temp);
        }
    }
