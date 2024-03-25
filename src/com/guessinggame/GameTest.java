package com.guessinggame;

public class GameTest {

		
		
		
		public void game(int randomnumber,int guessnumber ,int i) {
				
			if(i<4) {
			
			 if(randomnumber == guessnumber)
			{
				
				System.out.println("You win, the random number is "+randomnumber);
				
				return;
				
			}
			
			else if(guessnumber > randomnumber) {
		
				
				System.out.println("Please pick a lower number"); 
				
				}
			else  {
				
				System.out.println("Please pick a higher number");
			}
			}
			else {
				System.out.println("You lose the number to guess was the " +randomnumber +" actual number");
			}
			
			}
		

	}



