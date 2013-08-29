package ticTacToe;

import java.util.Random;

public class ComputerPlayer extends Player {

	ComputerPlayer() {
		namePlayer = "Computer";
	}

	Random rand = new Random();

	@Override
	public void doMove(Mark[][] arr) {
		boolean exit = false;
		while (!exit) {
			row = rand.nextInt(3);
			column = rand.nextInt(3);
			if (arr[row][column] == Mark.EMPTY) {
				arr[row][column] = mark;
				exit = true;
				System.out.println(namePlayer + " went to...");
			}
		}
	}
}
