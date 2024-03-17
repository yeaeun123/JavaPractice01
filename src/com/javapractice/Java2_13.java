package com.javapractice;

import java.util.Scanner;

public class Java2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자:");
		int a = scanner.nextInt();
		System.out.println("두번째 숫자:");
		int b = scanner.nextInt();
		
		int small;
		int large;
		
		if (a > b) {
			small = b;
			large = a;
		}else { 
			small = a;
			large = b;
		}
		
		if (small !=0 && large % small == 0 ) {
			System.out.println(small +"는 " + large +"의 약수입니다.");
		} else {
			System.out.println(large + "는 "+ small +"의 약수가 아닙니다.");
		}
		
		scanner.close();
	
	}
}
