package site.root3287.school.assignments.question.chapter8;

import java.util.Scanner;

import site.root3287.school.assignments.Question;

public class Ch8Q4 extends Question{

	@Override
	public void main() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type 'quit' to stop the program!");
		String input = in.nextLine();
		while(!input.equalsIgnoreCase("quit")){
			System.out.println(scroll(input));
			input = in.nextLine();
		}
	}
	
	private String scroll(String in){
		Character firstLetter = in.charAt(0);
		return in.substring(1)+firstLetter;
	}
}
