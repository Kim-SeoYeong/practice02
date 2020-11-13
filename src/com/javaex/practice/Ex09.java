package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두개 정수 입력 후 작은수가 큰수의 약수인지 확인
		//단, 0은 입력하지 않는다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if ((num1==0)||(num2==0)) {
			
			System.out.println("0은 입력하면 안되는 값 입니다.");
		
		} else if (num1<num2) {
			if(num2%num1==0) { 
				System.out.println(num1 + " 는(은) " + num2 + "의 약수입니다.");
			} else {
				System.out.println(num1 + " 는(은) " + num2 + "의 약수가 아닙니다.");
			}
		} else if (num1>num2) {
			if(num1%num2==0) { 
				System.out.println(num2 + " 는(은) " + num1 + "의 약수입니다.");
			} else {
				System.out.println(num2 + " 는(은) " + num1 + "의 약수가 아닙니다.");
			}
		}
		
		sc.close();
	}

}
