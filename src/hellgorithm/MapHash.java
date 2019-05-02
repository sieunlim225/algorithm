package hellgorithm;

import java.util.HashMap;
import java.util.Map;

public class MapHash {
	//key - value 를 이용한 알고리즘 
	 public static String loser() {
	        //완주하지 못한 선수 https://programmers.co.kr/learn/courses/30/lessons/42576
	        String loser = "none";
	        String[] participant = {"a","b","c"};
	        String[] completion = {"a","b","c","d"};
	        
	        Map<String, Integer> map = new HashMap<>();
	        
	        for(int p = 0 ; p < participant.length ; p++) {
	            map.put(participant[p], p);
	        }
	        
	        for(int c = 0 ; c < completion.length ; c++) {
	            if(!map.containsKey(completion[c])) {
	                loser = completion[c];
	            }
	        }
	        
	        return loser;
	    }
	 
	 public static boolean checkSuffix() {
	        //전화번호 목록 https://programmers.co.kr/learn/courses/30/lessons/42577
	        
	        Map<Integer, Integer> map2 = new HashMap<>();
	        int[] suffix = {119, 97674223, 1195524421};
	        
	        boolean result = true;
	        for (int i = 0; i < suffix.length; i++) {
	            //비교할 값을 헤시맵에 key로 담는다 key는 증가하는 i
	            map2.put(i, suffix[i]);
	            for (int j = 0; j < suffix.length; j++) {
	                //비교할 key 값
	                String mapSuffix = map2.get(i).toString();
	                if(j != i) {
	                    int compare = suffix[j];
	                    String compareStr = Integer.toString(compare);
	                    System.out.println("비교 : "+ mapSuffix +"대상 :"+compareStr);
	                    
	                    if(mapSuffix.startsWith(compareStr)) {
	                        result = false;
	                        break;
	                    }
	                }
	                
	            }
	        }
	        return result;
	    }
	 
	 
	 
}
