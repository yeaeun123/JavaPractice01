package com.javapractice3;

import java.util.Scanner;

public class Java3_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for (int j =1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		scanner.close();
		
	}

}
