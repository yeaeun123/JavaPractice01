package com.javapractice;

import java.util.Scanner;

public class Java3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num = scanner.nextInt();
		int i,j;
		for (i=1; i<=num ; i++) {
			for(j=1;j>i; j++) {
			System.out.print("*");
		}
		System.out.println("*");
		}
		scanner.close();
	
}}