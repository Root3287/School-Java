package site.root3287.school.assignments.question.chapter8;

import site.root3287.school.assignments.Question;

public class Ch8Q3 extends Question{

	@Override
	public void main() {
		String cc = "4000 1234 5678 9010";
		System.out.println("Credit card: "+ cc);
		System.out.println("Last 4: "+ last4(cc));
		System.out.println("Last 5: "+ last5(cc));
	}
	
	private String last4(String in){
		return in.substring(in.length()-4);
	}

	private String last5(String in){
		String firstStage = in.substring(in.length()-6);
		
		return firstStage.replace(" ", "");
	}
}
