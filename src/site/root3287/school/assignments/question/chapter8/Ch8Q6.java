package site.root3287.school.assignments.question.chapter8;

import java.util.Scanner;

import site.root3287.school.assignments.Question;

public class Ch8Q6 extends Question{

	@Override
	public void main() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type `quit` to stop the program!");
		String input = in.nextLine();
		while(!input.equalsIgnoreCase("quit")){
			System.out.println(stripHTML(input));
			input = in.nextLine();
		}
	}

	private String stripHTML(String input) {
		return input.replaceAll("\\<.*?>", "");
	}

}
