package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//나이가 19세 이상 65세 미만 => 1번 그룹입니다.
		//조건에 해당안되면 2번 그룹입니다 출력
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		if ((age>=19) && (age<65)) {
			System.out.println("1번그룹 입니다.");
		} else if (age<0){
			System.out.println("잘못된 입력값입니다.");
		} else {
			System.out.println("2번그룹 입니다.");
		}
		
		sc.close();
		
	}	

}
