package jeeinstudy;

import java.util.Random;
public class test0404_004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		System.out.println("로또 번호(중복허용)");
		for(int i = 0; i < 6; i++) {
			int num = random.nextInt(45) + 1; // 1~45번까지의 랜덤숫자
			System.out.println(num + " ");
		
	}
	
	}
}
