package site.root3287.school.assignments.question.chapter9;

import site.root3287.school.assignments.Question;

public class Ch9Q6 extends Question{

	@Override
	public void main() {
		int rows = 5;
		int[][] triangle = triangle(rows);
		int iStore = 0;
		for(int[] i : triangle){
	        int val = 1;

	        for (int j = 1; j < (rows - iStore); j++){
	           System.out.print("\t");
	        }
			for(int j : i){
				System.out.print(" ");
				if(j == 0){
					
				}else{
					System.out.print(j);
				}
			}
			System.out.print("\n");
		}
		iStore++;
	}
	
	private int[][] triangle(int rows){
		int[][] triangle = new int[rows][rows];
		for(int i = 0; i < rows; i++){
			int val = 1;
			for(int k = 0; k <= i; k++){
				triangle[i][k] = val;
				val = val * (i-k) / (k+1);
			}
			System.out.print("\n");
		}
		return triangle;
	}

}
