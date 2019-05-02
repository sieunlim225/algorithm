package hellgorithm;

import java.util.ArrayList;
import java.util.List;

public class Basic {

	    public static String anagram() {
	        String a = "aabbcc";
	        String b = "xxyybbb";
	        
	        int count = 0 ;
	        //8
	        //수학ㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱ
	        char[] charsA = a.toCharArray();
	        char[] charsB = b.toCharArray();
	        //같은 것만 찾아서 빼면 된다.
//	        int[] aAlpha = new int[26];
//	        int[] bAlpha = new int[26];
//	        for(int i = 0 ; i < charsA.length ; i ++) {
//	            System.out.println("=================================");
//	            aAlpha[charsA[i]-'a']++;
//	            System.out.println(aAlpha[charsA[i]-'a']);
//	            System.out.println(aAlpha[charsA[i]-'a']++);
//	        }
//	        for (int i = 0; i < charsB.length; i++) {
//	            bAlpha[charsB[i]-'a']++;        
//	        }
//	        for (int i = 0; i < 26; i++) {
//	            System.out.println(aAlpha[i] + " - " +bAlpha[i] +" = "+ (aAlpha[i] - bAlpha[i])  );
//	            
//	        }    
	        List<Integer> aList = new ArrayList<Integer>();
	        int added = 0 ;
	        for(int i = 0 ; i < charsA.length ; i ++) {
	            aList.add(charsA[i]-'a');
	            added++;        
	            for (int j = 0; j < charsB.length; j++) {
	                int aListInt = aList.get(i);
	                int charsAs = charsB[i]-'a';
	                
//	                if(charsAs==charsB[j]-'a') {
//	                    System.out.println(charsAs);
//	                    
//	                }
	                
	                if(aListInt!=charsB[j]-'a') {
	                    aList.add(charsAs);
	                    //count++;
	                    
	                }
	                
	            }
	        }
	        System.out.println(aList.size());
	        System.out.println(count);
	        
	        /*
	         * for (char _a : charsA) { //char 는 아스키코드로도 읽힌다 //알파벳 a를 0 부터 시작하게할려면 a(97) -
	         * 'a'(97) System.out.println(_a - 'a');
	         * 
	         * 
	         * } for (char _b : charsB) { System.out.println(_b - 'a'); }
	         */
	        return "";
	    }
	    

}
