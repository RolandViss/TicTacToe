package ticTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer() {
		System.out.println();
		System.out.println("Please initialize yourself !!!");
		System.out.print("Player enter your name: ");
		namePlayer = input.nextLine();
	}

	public Scanner input = new Scanner(System.in);

	@Override
	public void doMove(Mark[][] field) {
		boolean check = false;
		do {
			try {
				System.out.print(namePlayer + " enter row(1 - 3): ");
				row = input.nextInt();
				System.out.print(namePlayer + " enter column(1 - 3): ");
				column = input.nextInt();

				if (row < 4 && row >= 1 && column < 4 && column >= 1
						&& field[row - 1][column - 1] == Mark.EMPTY) {
					field[row - 1][column - 1] = mark;
					check = true;

				} else {
					System.out.println("Invalid input move");
				}
			} catch (InputMismatchException in) {
				System.out.println("Wrong input, integers 1-3 allowed only.");
				System.out.println("Try again");
				input.nextLine();
			}
		} while (!check);
	}
}
