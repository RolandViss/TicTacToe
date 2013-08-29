package ticTacToe;

class Game {

	private Player playerOne, playerTwo;
	private Mark currentPlayer = null;
	private Board board = new Board();

	Game(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		playerOne.setMark(Mark.X);
		playerTwo.setMark(Mark.O);
	}

	public void startGame() {
		board.printBoard();
		while (!board.checkForWinAndDrow()) {
			if (currentPlayer != playerOne.getMark()) {
				playerOne.doMove(board.field);
				currentPlayer = playerOne.getMark();
			} else {
				playerTwo.doMove(board.field);
				currentPlayer = playerTwo.getMark();
			}
			board.printBoard();
		}
	}
}
