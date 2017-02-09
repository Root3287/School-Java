package site.root3287.school.assignments.question.chapter8;

import java.util.ArrayList;
import java.util.Scanner;

import site.root3287.school.assignments.Question;

public class Ch8Q9 extends Question{

	@Override
	public void main() {
		Scanner in = new Scanner(System.in);
		String answerString = "There is no one who loves pain itself, who seeks after it and wants to have it, simply because it is pain...";
		//String answerString = "Potato";
		String blank = "";
		for(int i = 0; i < answerString.length(); i++){
			if(answerString.charAt(i) == ' '){
				blank = blank + ' ';
			}else{
				blank = blank + '_';
			}
		}
		StringBuilder guess = new StringBuilder(blank);
		boolean running = true;
		while(running){
			//Show the spaces...
			System.out.println(guess.toString());
			
			String input = in.nextLine();
			if(input.length() == 0){
				System.out.println(input.length());
			}else{
				for(int list : find(answerString, input.charAt(0))){
					guess.setCharAt(list, input.charAt(0));
				}
			}
			ArrayList<Integer> endGame = find(guess.toString(), '_');
			if(endGame.isEmpty()){
				System.out.println("Congrats the answer is " + guess.toString() + "!");
				running = false;
			}
		}
	}
	
	private ArrayList<Integer> find(String str, Character regex){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) == regex){
				list.add(i);
			}
		}
		return list;
	}

}
