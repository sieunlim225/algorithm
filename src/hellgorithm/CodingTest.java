package hellgorithm;

import java.util.Scanner;

public class CodingTest {

	public static int[] solution(int[][] v) {
        int firstNum = 0;
        int secondNum = 0;
        
        int[] answer = new int[2];
		for (int i = 1; i < v.length; i++) {
			if(v[0][0] == v[i][0]) {
				firstNum = v.length-i;
			}
			if(v[0][1] == v[i][1]) {
				secondNum = v.length-i;
			}
			
		}
		answer[0] = v[firstNum][0];
		answer[1] = v[secondNum][1];
		
        return answer;
    }
	
	public static void main(String[] args) {
//		int[][] v = {{3,1},{5,1},{3,4}};
//		solution(v);
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = 0; i < b; i++) {
			System.out.println();
			for (int j = 0; j < a; j++) {
				//System.out("*");
			}
		}
	}
}
