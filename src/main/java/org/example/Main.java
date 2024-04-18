package org.example;

interface Tour{
//    public int addition(int a,int b);

    public String trip(String source,String Destination,int km);
}

//class Maths implements Add{
//    public int addition(int a,int b){
//        return a+b;
//    }
//
//}
public class Main {
    public static void main(String[] args) {

//      Add add=(a,b)->{return a+b;};
//        System.out.println(add.addition(5,5));

        Tour tour=(source, Destination, km) ->{
            StringBuffer sb=new StringBuffer();
            sb.append(source).append(" to ").append(Destination).append(" = ").append(km);
        return sb.toString();
        };
        System.out.println(tour.trip("Hyderabad","Bangaloore",570));
    }
}