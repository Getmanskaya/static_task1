package org.example;

class Counter {
    private static int count = 0;

    public void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}