package site.root3287.school.assignments.question.chapter8;

import site.root3287.school.assignments.Question;

public class Ch8Q8 extends Question{

	@Override
	public void main() {
		 System.out.println(isISBN("9780982477564"));
	}
	
	private boolean isISBN(String number){
		char[] num = number.toCharArray();
		int[] numbers = new int[num.length];
		int i = 0;
		for(Character x: num){
			numbers[i] = new Integer(x);
			i++;
		}
		int sum = 0;
		for(i=0; i<13; i++){
			if(i%2 == 0){ // even
				sum = sum + numbers[i] * 3;
			}else{ // odd
				sum = sum + numbers[i];
			}
		}
		return (sum%10 == 0 )?true:false;
	}

}
