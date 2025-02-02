package CoreJava;

import java.util.*;

public class P006_MenuDriven extends Actions {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Use Calculator. ");
		System.out.println();
		System.out.print("2. Check Vowel or Consonant. ");
		System.out.println();
		System.out.print("3. Number Guessing Game. ");
		System.out.println();
		System.out.print("0. Exit. ");
		System.out.println();
		System.out.print("Select Your Option: ");
		int choice = sc.nextInt();
		System.out.println();

		switch(choice) {
		case 1:
			calculator();
			break;
		case 2:
			vowelConsonent();
			break;
		case 3:
			numberGuessingGame();
			break;
		case 0:
			System.exit(0);
		default:
			System.out.println("Please choose the correct Option.");
		}
		
	}
}

class Actions{
	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		int a = sc.nextInt();
		System.out.println();
		System.out.print("Enter 2nd Number : ");
		int b = sc.nextInt();
		System.out.println();
		System.out.println("Enter the operator you want to perform the operation : ");
		char operator = sc.next().charAt(0);
		if(operator == '+') {
			System.out.println(a+" + "+b+" = "+(a+b));
		}else if(operator == '-') {
			System.out.println(a+" - "+b+" = "+(a-b));
		}else if(operator == '*') {
			System.out.println(a+" * "+b+" = "+(a*b));
		}else if(operator == '/') {
			System.out.println(a+" / "+b+" = "+((float)a/(float)b));
		}else if(operator == '%') {
			System.out.println(a+" % "+b+" = "+(a%b));
		}
	}
	
	public static void vowelConsonent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet : ");
		char alphabet = sc.next().charAt(0);
		if(alphabet == ('a')) {
			System.out.println("Your character is vowel");
		}else if(alphabet == 'e') {
			System.out.println("Your character is vowel");
		}else if(alphabet == 'i') {
			System.out.println("Your character is vowel");
		}else if(alphabet == 'o') {
			System.out.println("Your character is vowel");
		}else if(alphabet == 'u') {
			System.out.println("Your character is vowel");
		}else {
			System.out.println("Your character is consonent");
		}
	}
	
	public static void numberGuessingGame() {
		Scanner reader = new Scanner(System.in);
        String play = "yes";

        while(play.equals("yes")){

            //while loop to determine if we are going to play the game again
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;

            //while loop to check if the game is over
            while(guess != randNum) {
                System.out.print("Guess a number netween 1 and 100 ");
                guess= reader.nextInt();
                tries++;

                if(guess == randNum){

                    System.out.println("Awesome! You guessed the numer!");
                    System.out.println("It only took you " + tries + " guess!");
                    System.out.println("Would you like to play again? Yes or No: ");
                    play = reader.next().toLowerCase();

                } else if(guess > randNum) {
                    System.out.println("Yur guess is too high, try again.");
                } else {
                    System.out.println("Yur guess is too low, try again.");
                }
            }

        }
        reader.close();
	}
}
