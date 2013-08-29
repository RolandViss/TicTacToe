package ticTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayGame {

	public Scanner input;

	public void displayMenu() {
		System.out.println();
		System.out.println("     Menu Tic Tac Toe");
		System.out.println("1.    Human VS Computer");
		System.out.println("2.    Human VS Human");
		System.out.println("3. Computer VS Computer");
		System.out.println("4.      Exit game");
		System.out.print("Enter mode: ");
	}

	public int userInput() {
		boolean index = false;
		int choice = 0;
		displayMenu();
		input = new Scanner(System.in);
		while (!index) {
			try {
				choice = input.nextInt();
			} catch (InputMismatchException in) {
				System.out.println("Wrong input, integers 1-3 allowed only.");
				System.out.println("Try again");
				System.out.print("Enter mode: ");
				input.nextLine();
				continue;
			}
			index = true;
		}
		return choice;
	}

	public static void main(String[] args) {
		PlayGame play = new PlayGame();
		int in = 0;
		Game game = null;
		while (in != 4) {
			switch (in = play.userInput()) {

			case 1:
				game = new Game(new HumanPlayer(), new ComputerPlayer());
				break;

			case 2:
				game = new Game(new HumanPlayer(), new HumanPlayer());
				break;

			case 3:
				game = new Game(new ComputerPlayer(), new ComputerPlayer());
				break;

			case 4:
				System.out.println(" Good Bye");
				break;

			default:
				System.out.println("Wrong input, try again");
			}

			if (in != 4) {
				game.startGame();
			}
		}
	}
}
