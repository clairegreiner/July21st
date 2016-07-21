package com.greiner;

public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 110; i> 0; i--) {
			
			 if (((i % 3)==0) && ((i %5) == 0) && ((i %7 )==0)) {
					System.out.println("FizzBuzzBang"); 
				// i mod 3	
			if ((i % 3)==0) {
				System.out.println("Fizz"); 
			}
				
			} else if (((i % 3)==0) && ((i %7 )==0)) {
					System.out.println("FizzBuzzBang");
				
					//i mod 5
			}   if ((i % 5)==0) {
				System.out.println("Buzz"); 
				
				if ((i % 7)==0) {
					System.out.println("Bang");
				}		
			} else if (((i % 3)==0) && ((i%5) == 0)) {
				
			}
				
			}
				// i mod 5
			} else if (((i%5) == 0) && ((i%7 )==0)) {
					System.out.println("FizzBuzzBang");
			// If all the else stmts fails, then just print the n
						
			} else {
					System.out.println(i);
				}
		}}

//check in to the 1st repo this morning






}
