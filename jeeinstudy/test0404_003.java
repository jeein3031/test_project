package jeeinstudy;

import java.util.Random; // 랜덤의 경우 꼭 써주기


public class test0404_003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100까지의 랜덤숫자 뽑기
		
		Random random = new Random(); // Random 객체 생성
		
		int randomInt = random.nextInt(101); // 00~100사이 랜덤 정수
		double randomDouble = random.nextDouble();  // 0.0~1.0  사이 랜덤 실수
		boolean randomBoolean = random.nextBoolean(); //true 또는 false 랜덤값
		
		System.out.println("랜덤 숫자 (0~100): " + randomInt);

		System.out.println("랜덤 실수 (0.0 ~ 1.0): " + randomDouble);
		
		System.out.println("랜덤 불리언 값:"  +  randomBoolean);
	}

}
