package week4;

public class j_71204_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		float average = 0f;
		
		int[] score = {100,80,100,100,90};
		
		for(int i=0; i<score.length; i++)
			sum += score[i];
			
		average = sum / (float)score.length;
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+average);
	}
	
}
