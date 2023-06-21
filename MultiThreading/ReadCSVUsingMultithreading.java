package com.onbill.java.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReadCSVUsingMultithreading{

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/alin/Downloads/organizations-1000.csv"));

            ExecutorService executorService = Executors.newFixedThreadPool(5);

            String line;
            while ((line = reader.readLine()) != null) {
                executorService.submit(new CSVLineProcessor(line));
            }
            executorService.shutdown();
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static class CSVLineProcessor implements Runnable {

        private final String line;

        public CSVLineProcessor(String line) {
            this.line = line;
        }

        @Override
        public void run() {
            String[] values = line.split(",");
            System.out.println(values[0]+"Company ID=" + values[1] + ", Website=" + values[2]
					+ ", Country=" + values[3] + ", Description=" + values[4] + ", Founded= " + values[5]
					+ ", Industry= " + values[6]+", No of values= " + values[7]);
            System.out.println();
        }
    }
}
