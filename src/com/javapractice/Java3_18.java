package com.javapractice;

import java.util.Scanner;

public class Java3_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num = scanner.nextInt();
		int i,j;
		for (i=0; i<=num ; i++) {
			for(j=num-1; j>=i; j--) {
			System.out.print("*");
			for(j=i+1; j<=num; j++) {
				System.out.print("*");
			}
		}
			
			
		System.out.println();
	
		}	
	
		scanner.close();
	}
	}

