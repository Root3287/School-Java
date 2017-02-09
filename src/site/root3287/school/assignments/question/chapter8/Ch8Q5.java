package site.root3287.school.assignments.question.chapter8;

import java.util.Scanner;

import site.root3287.school.assignments.Question;

public class Ch8Q5 extends Question{

	@Override
	public void main() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type `quit` to stop the program!");
		String input = in.nextLine();
		while(!input.equalsIgnoreCase("quit")){
			System.out.println(bin(input));
			input = in.nextLine();
		}
	}
	
	private int bin(String in){
		Character t = in.charAt(0);
		return (t == '0')? -1:1;
	}
	
}
