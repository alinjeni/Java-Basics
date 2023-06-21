package com.onbill.java.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
	public static void main(String[] args) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/alin/Downloads/organizations-1000.csv"));
			while ((line = br.readLine()) != null) 
			{
				String[] employee = line.split(","); 
				System.out.println("Company Name=" + employee[1] + ", Website=" + employee[2]
						+ ", Country=" + employee[3] + ", Description=" + employee[4] + ", Founded= " + employee[5]
						+ ", Industry= " + employee[6]+", No of Employee= " + employee[7]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
