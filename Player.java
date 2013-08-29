package ticTacToe;

abstract class Player {

	public String namePlayer;

	public Mark mark;

	public void setMark(Mark mark) {
		this.mark = mark;
	}

	public Mark getMark() {
		return mark;
	}

	public int row, column;

	abstract void doMove(Mark[][] arr);

}
