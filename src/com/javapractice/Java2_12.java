package com.javapractice;

import java.util.Scanner;

public class Java2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요.");
		System.out.println("숫자1:");
		int num1 = scanner.nextInt();
		System.out.println("숫자2:");
		int num2 = scanner.nextInt();
		System.out.println("숫자3:");
		int num3 = scanner.nextInt();
	
		int small = num1;
		
		if (num2 < small) {
			small = num2;
		
	}	if (num3 < small){
			small = num3;
	}	System.out.println("가장 작은 수는 "+small + "입니다.");

	
	
		scanner.close();
	}}
		
	


