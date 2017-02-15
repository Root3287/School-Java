package site.root3287.school.assignments.question.chapter9;

import site.root3287.school.assignments.Question;

public class Ch9Q2 extends Question{

	@Override
	public void main() {
		for(int i : fibonacci(6)){
			System.out.println(i);
		}
	}
	
	private int fib(int n){
		if(n <= 1){
			return 1;
		}else{
			return fib(n-1) + fib(n-2);
		}
	}
	
	private int[] fibonacci(int index){
		int[] fib = new int[index+1];
		for(int i = 0; i < index; i++){
			if(i == 0){
				fib[0] =0;
			}else{
				fib[i] = fib(i-1); 
			}
		}
		return fib;
	}

}
