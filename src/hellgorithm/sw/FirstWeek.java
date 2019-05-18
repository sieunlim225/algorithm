package hellgorithm.sw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstWeek {

	public static int a(int k, String p) {
		
		//Long.parseLong(p, 2);
		p = p+"0"+f(g(p));
		
		if(p.length()>=k) {
			int answerChar = p.charAt(k-1)-'0';
			return answerChar;
		}else {
			return a(k,p);
		}
		
		
	}
	
	public static String f(String g) {
		
		return new StringBuffer(g).reverse().toString();
	}
	
	public static String g(String p) {
		String pStr = "";
	
		for (int i = 0; i < p.length(); i++) {
			char pChar = p.charAt(i);
			
			int pNum = pChar-'0' == 1 ? 0 : 1;
			pStr += Integer.toString(pNum);
		}
	
		return pStr;
	}
	
	//-----------------------
	
	public static float two(int n, int k, int[] m) {
		float skill = 0;
		Arrays.sort(m);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < m.length; i++) {
			list.add(m[i]);
		}
		Collections.reverse(list);
		
		for (int i = k-1; i >= 0; i--) {
			skill = (skill + list.get(i))/2;
			
		}
		System.out.println(skill);
		return skill;
	}
	
	//-------------------------
	public static void main(String[] args) {
		//long start = System.currentTimeMillis(); //시작하는 시점 계산
		//System.out.println(a(3,"0"));
		//long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		//System.out.println( "실행 시간 : " + ( end - start )/1000.0 ); //실행 시간 계산 및 출력

		//------------------------------
		//int[] m = {9,5,2,3,5};
		//two(5,3,m);
		
		//------------------------------
		

	}
	
	
}
