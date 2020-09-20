package com.dd.ignitesolutionstest.question1;

public class Counter {

    private int count = 0;

    //Making class constructor private for making this class singleton
    private Counter() {
    }

    // Eager Initialization
    private static Counter counter = new Counter();

//    Lazy Initialization
/*

    public static Counter getInstance() {
        if (counter == null) {
            counter = new Counter();
        }
        return counter;
    }
*/

    // Creation of a method for accessing the object of singleton class
    public static Counter getInstance() {
        return counter;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
