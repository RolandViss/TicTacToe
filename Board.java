package ticTacToe;

public class Board {

	Mark[][] field = new Mark[3][3];

	private Mark winner = null;

	private boolean returnResult = false;

	public Board() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				field[i][j] = Mark.EMPTY;
			}
		}
	}

	public void printBoard() {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(field[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public boolean checkForWinAndDrow() {
		if (checkForWinHorizontally() || checkForWinUpright()
				|| checkForWinDiagonallyLeft() || checkForWinDiagonallyRight()) {
			System.out.println(winner + " Winner!!!");
			return true;
		} else {
			if (checkForDrow()) {
				System.out.println("Drow !!!");
				return true;
			} else {
				return false;
			}
		}
	}

	private boolean checkForWinHorizontally() {
		for (int i = 0; i < 3; i++) {
			if (field[i][0] == field[i][1] && field[i][1] == field[i][2]
					&& field[i][2] != Mark.EMPTY) {
				winner = field[i][0];
				returnResult = true;
			}
		}
		return returnResult;
	}

	private boolean checkForDrow() {
		int count = 0;
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				if (field[row][column] == Mark.EMPTY) {
					count++;
				}
			}
		}
		if (count == 0) {
			returnResult = true;
		}
		return returnResult;
	}

	private boolean checkForWinUpright() {
		for (int i = 0; i < 3; i++) {
			if (field[0][i] == field[1][i] && field[1][i] == field[2][i]
					&& field[2][i] != Mark.EMPTY) {
				winner = field[0][i];
				returnResult = true;
			}
		}
		return returnResult;
	}

	private boolean checkForWinDiagonallyLeft() {
		if (field[0][0] == field[1][1] && field[1][1] == field[2][2]
				&& field[2][2] != Mark.EMPTY) {
			winner = field[0][0];
			return true;
		} else {
			return false;
		}
	}

	private boolean checkForWinDiagonallyRight() {
		if (field[0][2] == field[1][1] && field[1][1] == field[2][0]
				&& field[2][0] != Mark.EMPTY) {
			winner = field[1][1];
			return true;
		} else {
			return false;
		}
	}
}
