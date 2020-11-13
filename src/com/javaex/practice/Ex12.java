package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기호, 숫자1, 숫자2로 입력
		//기호는 (+, -, *, /)
		//입력된 내용으로 계산하여 값 출력
		//나눗셈의 경우 분모가 0이면 계산 불가
		float result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("기호 : ");
		char kiho = sc.next().charAt(0);
		System.out.print("숫자1 : ");
		float num1 = sc.nextFloat();
		System.out.print("숫자2 : ");
		float num2 = sc.nextFloat();
		
		if (kiho == '+') {
			result = num1 + num2;
			System.out.println("결과는 : " + result);
		} else if (kiho == '-') {
			result = num1 - num2;
			System.out.println("결과는 : " + result);
		} else if (kiho == '*') {
			result = num1 * num2;
			System.out.println("결과는 : " + result);
		} else if (kiho == '/') {
			if((num1==0) || (num2==0)) {
				System.out.println("계산할 수 없습니다.");
			} else {
				if (num1>num2) {
					result = num1 / num2;
					System.out.println("결과는 : " + result);
				} else if (num1<num2) {
						result = num2 / num1;
						System.out.println("결과는 : " + result);
				}
			}
		} else {
			System.out.println("계산할 수 없는 기호입니다.");
		}
		
		sc.close();
	}

}
