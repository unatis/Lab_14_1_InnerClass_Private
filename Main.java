package com.company;

public class Main {

    public static void main(String[] args) {

        Outer myOuter = new Outer();

        Outer.Inner myInner = myOuter.new Inner();

        System.out.println(myOuter.x + " " + myInner.y);


    }

}
