package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//함수값을 계산하기
		//x*x*x - 9 * x + 2, x<=0
		//7 * x + 2, x>0
		float result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			result = 7 * num + 2;
			System.out.println("계산결과는 " + result + " 입니다.");
		} else if (num <= 0) {
			result = num * num * num - 9 * num + 2;
			System.out.println("계산결과는 " + result + " 입니다.");
		} else {
			System.out.println("다시 입력해주세요.");
		} 
		
		sc.close();
	}

}
