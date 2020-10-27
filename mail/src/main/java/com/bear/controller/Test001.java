package com.bear.controller;

public class Test001 {
    {
        System.out.println("0");
    }
    static {
        System.out.println("1");
    }
    public static void main(String[] args) {
        new Out.Inner();
    }
}
class Out{

    static {
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
    public Out(){
        System.out.println("4");
    }

    static class Inner{
        public Inner(){
            System.out.println("5");
        }
        static {
            System.out.println("6");
        }
    }


}