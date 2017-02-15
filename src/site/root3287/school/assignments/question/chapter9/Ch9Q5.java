package site.root3287.school.assignments.question.chapter9;

import site.root3287.school.assignments.Question;

public class Ch9Q5 extends Question{

	@Override
	public void main() {
		int[] number = {1,1,3,5,7};
		System.out.println(average(number));
	}
	private float average(int[] num){
		float sum = 0;
		for(int x : num){
			sum += x; 
		}
		return sum / num.length;
	}
}
