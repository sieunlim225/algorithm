package hellgorithm;

public class AddOddNum {

	//소수의 합 https://programmers.co.kr/learn/courses/30/lessons/14406
	
//	2부터 N까지의 모든 소수의 합을 구하세요.
//	N이 7이라면 {2,3,5,7} = 17을 출력 하시면 됩니다.
//	N의 범위는 2이상 10,000,000이하 입니다.
//	효율성 테스트의 모든 시간 제한은 1초입니다.
	
	public static void main(String[] args) {
		int n = 7;
		int sum = 0;
		for(int i = 2 ; i <= n ; i++) {
			//234567
			if(i % 2 == 1 || i == 2) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
	}
}
