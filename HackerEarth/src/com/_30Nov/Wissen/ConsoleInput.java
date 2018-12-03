package com._30Nov.Wissen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner cin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		
		
			int a = cin.nextInt();
			String s = cin.next();

			int q = cin.nextInt();

			System.out.println(a + " " + s + " " + q);

			for(int i = 0; i<q;i++) {
				int index = 0;
				String c = "";
				int j = cin.nextInt();
				if(j==1) {
				 index = cin.nextInt();
					 c = cin.next();
					
				}
				
				if(j==2) {
					System.out.println("inside query 2");
				}
				System.out.println("inside query 1 "+index+" "+c);
				
			}


			cin.close();
			
		} 
		
				//
//		int arr[] = new int[3];
//
//		for (int i = 0; i < 3; i++) {
//			a = cin.nextInt(); // Takes input from separate lines
//			arr[i] = a;
//
//		}
//		for (int i = 0; i < 3; i++) {
//			System.out.println(arr[i]);
//		}

	}


