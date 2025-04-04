package jeeinstudy;

public class test0403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제2. 1부터 100까지의 짝수,홀수끼리 각각더한 값 구하기
		

	     int total = 0; //짝수 합
	     int total2 = 0; //홀수 합

	     
	     for (int i = 1; i <= 100; i++) {
	    	if (i % 2 == 0) { //짝수의 합
	           total += i;
	    	
	    	}
	           System.out.println("짝수합 = " + total); 
	           
	    	}
              for (int i = 1; i <= 100; i++) {
        	 if (i % 2 != 0) {  //홀수의 합
        		 total2 += i;
        		 
        	 
        	 }	  System.out.println("홀수합 = " +  total2);
        		 
        	 }
         }
	     
	}

