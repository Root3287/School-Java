package site.root3287.school.assignments.question.chapter8;

import java.util.Scanner;

import site.root3287.school.assignments.Question;

public class Ch8Q1 extends Question{

	@Override
	public void main() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type 'quit' to stop the program!");
		String input = in.next();
		String newString = "";
		while(!input.equalsIgnoreCase("quit")){
			newString = input.replace("-", "");
			System.out.println(newString);
			input = in.nextLine();
		}
	}

}
