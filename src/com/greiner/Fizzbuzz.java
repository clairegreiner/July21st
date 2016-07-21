package com.greiner;

// I get the concept, but need to police the curly braces
public class Fizzbuzz {

	public static void main(String[] args) {
		// Where the hell does the arg end? // i mod 3 and Fizz

		for (int i = 110; i > 0; i--) {

			if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0)) {
				System.out.println("FizzBuzzBang");
			
			} else if (((i % 3) == 0) && ((i % 7) == 0)) {
				System.out.println("FizzBang");

				// i mod 5 and Buzz

			} else if (((i % 5) == 0) && ((i % 7) == 0)) {
				System.out.println("BuzzBang");

				// i mod 5 and Buzz
			} else if (((i % 3) == 0) && ((i % 5) == 0)) {
				
			} else if ((i % 5) == 0) {
				System.out.println("Buzz");
			
			} else if ((i % 7) == 0) {
				System.out.println("Bang");
			
			} else if ((i % 3) == 0) {
				System.out.println("Fizz");
			}
				

				// i mod 7 and Bang

				// } else if (((i%5) == 0) && ((i%7 )==0)) {
				// System.out.println("FizzBuzzBang");
				// If all the else stmts fails, then just print the n

			 else {
				System.out.println(i);
			}
		}
	}

	// check in to the 1st repo this morning

}
