package jeeinstudy;

import java.util.Random;
import java.util.HashSet;
import java.util.Set;



public class test0404_005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로또2 : 숫자 6개를 찍어본다 (중복안되게)
		
		Random random = new Random();
		Set<Integer> lottoNumbers = new HashSet<>();  // 중복 제거를 위한 Set 사용
		
       while (lottoNumbers.size() < 6) {  // 중복있으면 다시뽑기
        	int num = random.nextInt(45) + 1;
			lottoNumbers.add(num); //중복된 숫자는 자동으로 제외됨
		}
         System.out.println("로또번호(중복제거): " + lottoNumbers);
	}

		
	}