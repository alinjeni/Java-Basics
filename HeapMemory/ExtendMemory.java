package com.onbill.java.programs;

import java.io.IOException;

public class ExtendMemory {
    public static void main(String[] args) {
        long initialMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();

        System.out.println("Initial Memory: " + initialMemory / (1024 * 1024) + "MB");
        System.out.println("Max Memory: " + maxMemory / (1024 * 1024) + "MB");

        try {
        	 while (true) {
                 String str = new String("string object");
             }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error occurred.");
            long newMaxMemory = maxMemory * 2; 

            System.out.println("Increasing max memory to " + newMaxMemory / (1024 * 1024) + "MB");
        
            String javaCmd = "java -Xms512m -Xmx" + newMaxMemory / (1024 * 1024) + "m MemoryAllocationExample";

            try {
                Runtime.getRuntime().exec(javaCmd);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
