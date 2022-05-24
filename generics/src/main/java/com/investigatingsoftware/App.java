package com.investigatingsoftware;

public class App 
{
    public static void main( String[] args )
    {
        BoxClassic b1 = new BoxClassic();
        BoxGeneric<String> b2 = new BoxGeneric<>();

        b1.set("b1 Classic");
        System.out.println(b1.get());

        b2.set("b2 Generic");
        System.out.println(b2.get());

        OrderedPair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        OrderedPair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");

        System.out.println( "Hello! " + p2.getValue() + p1.getValue() );
    }
}
