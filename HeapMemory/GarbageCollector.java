package com.onbill.java.programs;

public class GarbageCollector {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        printMemoryUsage(runtime);

        for (int i = 0; i < 100000; i++) {
            new GCObject();
        }

        printMemoryUsage(runtime);
        System.gc();
        printMemoryUsage(runtime);
    }

    private static void printMemoryUsage(Runtime runtime) {
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Total Memory: " + totalMemory / (1024 * 1024) + "MB");
        System.out.println("Used Memory: " + usedMemory / (1024 * 1024) + "MB");
        System.out.println("Free Memory: " + freeMemory / (1024 * 1024) + "MB");
        System.out.println("---------------------------");
    }
}

class GCObject {
    private byte[] data;

    public GCObject() {
        data = new byte[1024 * 1024];
    }
}

