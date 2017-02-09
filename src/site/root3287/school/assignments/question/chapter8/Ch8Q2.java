package site.root3287.school.assignments.question.chapter8;

import java.util.Scanner;

import site.root3287.school.assignments.Question;

public class Ch8Q2 extends Question{

	@Override
	public void main() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type 'quit' to stop the program!");
		String input = in.nextLine();
		while(!input.equalsIgnoreCase("quit")){
			System.out.println(date(input));
			input = in.nextLine();
		}
	}
	
	private String date(String in){
		String month;
		String days;
		String years;
		
		int firstPointer = in.indexOf('/');
		int secondPointer =in.indexOf('/', firstPointer+1);
		
		days = in.substring(0, firstPointer);
		month = in.substring(firstPointer+1, secondPointer);
		years = in.substring(secondPointer+1);
		return month+"-"+days+"-"+years;
	}

}
