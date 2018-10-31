package com.HelloJava;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Hello {

	static //BufferedReader cin = new BufferedReader(new InputStream());
	PrintWriter cout = new PrintWriter(System.out, true);
	
	public static void main(String[] args)
	{
		cout.println("hello world!!");
	}
	
}


