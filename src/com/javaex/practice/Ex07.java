package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두개의 정수를 입력, 큰수를 작은수로 나누고
		//몫과 나머지를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if ((num1 > num2) || (num1==num2)){
			System.out.println("몫 : " + num1 / num2);
			System.out.println("나머지 : " + num1 % num2);
		} else if (num1 < num2) {
			System.out.println("몫 : " + num2 / num1);
			System.out.println("나머지 : " + num2 % num1);
		}
		sc.close();
	}

}
