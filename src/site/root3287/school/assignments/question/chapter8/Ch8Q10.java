package site.root3287.school.assignments.question.chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import site.root3287.school.assignments.Question;

public class Ch8Q10 extends Question {

	@Override
	public void main() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type 'quit' to stop the program!");
		String input = in.nextLine();
		while(!input.equalsIgnoreCase("quit")){
			System.out.println(shuffle(input));
			input = in.nextLine();
		}
	}
	
	private String shuffle(String input){
        List<Character> characters = new ArrayList<Character>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();
    }

}
