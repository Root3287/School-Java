package site.root3287.school.assignments.question.chapter8;

import site.root3287.school.assignments.Question;

public class Ch8Q7 extends Question{

	@Override
	public void main() {
		System.out.println(isPalindrome("Madam, I'm adam"));
	}
	private boolean isPalindrome(String in){
		in = in.toLowerCase();
		in = in.replaceAll("[^A-Za-z0-9 ]", "");
		in = in.replace(" ", "");
		if(in.equals(palindrome(in))){
			return true;
		}
		return false;
	}
	private String palindrome(String in){
		in = in.toLowerCase();
		in = in.replaceAll("[^A-Za-z0-9 ]", "");
		in = in.replace(" ", "");
		String out = "";
		for(int i = in.length()-1; i >= 0; i--){
			out = out + in.charAt(i);
		}
		return out;
	}
}
