package com.guessinggame;

import java.util.Random;
import java.util.Scanner;



public class Random1 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		Random ran = new Random();
		
		int randomnumber1 = ran.nextInt(100);
		
		GameTest test= new GameTest();
		
		System.out.println("Guess a number");
		
		for(int i=0; i<5; i++) {
		
			
			int guessnumber=scan.nextInt();
			
			 if((guessnumber<1) || (guessnumber>100)) {
				
				System.out.println("Your guess is not between 1 and 100,please try again");
				
				System.out.println("Guess another number");
			}
			 else {
				 
	         test.game(randomnumber1,guessnumber,i);
	    
		}
		
		}

	}

}
