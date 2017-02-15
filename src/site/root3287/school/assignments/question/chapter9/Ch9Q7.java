package site.root3287.school.assignments.question.chapter9;

import java.util.Random;

import site.root3287.school.assignments.Question;

public class Ch9Q7 extends Question{

	@Override
	public void main() {
		Random rand = new Random();
		
		int index =10;
		int[] array = new int[index];
		for(int i=0; i<index; i++){
			array[i] = rand.nextInt(index);
		}
		printArray(array);
		rotateRight(array);
		printArray(array);
		rotateLeft(array);
		printArray(array);
		rotate(array, -2);
		printArray(array);
	}
	private void printArray(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
	}
	
	private void rotateRight(int[] a){
		int last = a[a.length-1];
		int first = a[0];
		int[] temp = new int[a.length];
		for(int i = 0; i < a.length; i++){
			if(i == a.length -1){
				temp[i] = first;
			}else{
				temp[i] = a[i+1];
			}
		}
		for(int i = 0; i < a.length; i++){
			a[i] = temp[i];
		}
	}
	private void rotateLeft(int[] a){
		for(int i = 0; i < a.length-1; i++){
			rotateRight(a);
		}
	}
	private void rotate(int[] a, int pos){
		if (pos > 0){
			for(int i = 0; i < Math.abs(pos); i++){
				rotateLeft(a);
			}
		}else{
			for(int i = 0; i < Math.abs(pos); i++){
				rotateRight(a);
			}
		}
	}
}
