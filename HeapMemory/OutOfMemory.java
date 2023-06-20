package com.onbill.java.programs;

public class OutOfMemory{
    public static void main(String[] args) {
        try {
            while (true) {
                String str = new String("string object");
            }
            //long arraysize=1000000000;
            //int[] Array1=new int[arraysize];
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory exception occurred.");
        }
    }
}
