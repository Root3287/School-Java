package site.root3287.school.assignments.question.chapter9;

import java.awt.Color;

import site.root3287.school.assignments.Question;

public class Ch9Q4 extends Question{

	@Override
	public void main() {
		Color[][] board = new Color[3][3];
		fillCheckerBoard(board);
		for(Color[] x : board){
			System.out.print("|");
			for(Color y : x){
				System.out.print(y +"|");
			}
			System.out.print("\n");
		}
	}
	private void fillCheckerBoard(Color[][] board){
		int i =0;
		for(Color[] x : board){
			int j = 0;
			for(Color y : x){
				if(i % 2 == 0){
					if(j % 2 == 0){
						board[i][j] = Color.WHITE;
					}else{
						board[i][j] = Color.BLACK;
					}
				}else{
					if(j % 2 == 1){
						board[i][j] = Color.WHITE;
					}else{
						board[i][j] = Color.BLACK;
					}
				}
				j++;
			}
			i++;
		}
	}
}
