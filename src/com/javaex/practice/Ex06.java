package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//큰수와 작은수를 분류 하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("큰수 : " + num1 + "    " +
								"작은수 : " + num2 + " 입니다.");
		} else if (num1<num2) {
			System.out.println("큰수 : " + num2 + "    " +
					"작은수 : " + num1 + " 입니다.");
		} else {
			System.out.println("같은 숫자 입니다.");
		}
		sc.close();
	}
}
