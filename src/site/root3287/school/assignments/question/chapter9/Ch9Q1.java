package site.root3287.school.assignments.question.chapter9;

import site.root3287.school.assignments.Question;

public class Ch9Q1 extends Question{

	@Override
	public void main() {
		for(float i : makePythagoreanTriple(4, 3)){	
			System.out.println(i);
		}
	}
	private float[] makePythagoreanTriple(float m, float n){
		float[] out = new float[3];
		if(m > n){
			
		}else{
			float temp = n;
			n = m;
			m = temp;
		}
		float a = m*m - n*n;
		float b = 2*m*n;
		float c = m*m + n*n;
		out[0] = a;
		out[1] = b;
		out[2] = c;
		return out;
	}
}
