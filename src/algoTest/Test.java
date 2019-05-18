package algoTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	 public static int solution(String plain) {
/* 첫번째 시도 풀이 과정	 
	     System.out.println("플레인:"+plain);
		 String reversed = new StringBuilder(plain).reverse().toString(); 
		 System.out.println("리벌스:" + reversed);
		 int revIdx = plain.indexOf(reversed);
		 System.out.println( plain.replace(reversed,""));
*/
	
/* 두번쨰 시도 풀이 과정
		String addedStr = plain; 
		
		for (int i = 0; i < plain.length(); i++) {
			String charStr = Character.toString(plain.charAt(i));
			addedStr += charStr;
			String reversed = new StringBuilder(addedStr).reverse().toString();
			if(reversed.equals(addedStr)) {
				break;
			}
		}
		int answer = addedStr.length();
*/

//약 30분을 남겨놓고 테스트가 종료되어, 생각하고 있었지만 완성하지 못한 코드 입니다.
//아래 풀이는 코딩 테스트 종료 후 작성한 코드입니다.
		List<Integer> list = new ArrayList<Integer>();

		String reversed = new StringBuilder(plain).reverse().toString();
		for (int i = 0; i < reversed.length(); i++) {
			String compareStr = reversed.substring(i,reversed.length());
			String addedStr = plain + compareStr;
			String addedReverse = new StringBuilder(addedStr).reverse().toString();
			
			if(addedReverse.equals(addedStr)) {
				list.add(addedStr.length());	
			}
		}
		int answer = Collections.min(list);
		
	        return answer;
	 }
	
	 public static void main(String[] args) {
		String plain = "aba";
		System.out.println(solution(plain));
	}

}
