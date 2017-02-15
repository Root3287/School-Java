package site.root3287.school.assignments.question.chapter9;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import site.root3287.school.assignments.Question;

public class Ch9Q3 extends Question{

	private int[] scores = {
			1, // A = 1
			3, // B = 2
			3, // C = 3
			2, // D = 4
			1, // E = 5
			4, // F = 6
			2, // G = 7
			4, // H = 8
			1, // I = 9
			8, // J = 10
			5, // K = 11
			1, // L = 12
			3, // M = 13
			1, // N = 14
			1, // O = 15
			3, // P = 16
			10, // Q = 17
			1, // R = 18
			1, // S = 19
			1, // T = 20
			1, // U = 21
			4, // V = 22
			4, // W = 23
			8, // X = 24
			4, // Y = 25
			10 // Z = 26
		};
	@Override
	public void main() {
		//computeScore("a");
		System.out.println(computeScore("Q"));
	}
	private int computeScore(String word) {
		int out = 0;
		String newWord = word.toUpperCase();
		for(int i = 0; i<word.length(); i++){
			int letter = new Character(word.charAt(i)).getNumericValue(word.charAt(i)) - 10;
			//System.out.println(letter);
			int score = scores[letter];
			out += score;
		}
		return out;
	}
}
