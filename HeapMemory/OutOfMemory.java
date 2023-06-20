package com.onbill.java.programs;

public class OutOfMemory{
    public static void main(String[] args) {
        try {
            while (true) {
                String str = new String("string object");
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory exception occurred.");
        }
    }
}
