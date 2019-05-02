package hellgorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapA {
	public static int solution(int[] scoville, int K) {
		//https://programmers.co.kr/learn/courses/30/lessons/42626
        int answer = 0;

       	//if(scoville.length < 2) answer = -1;
       	PriorityQueue<Integer> que = new PriorityQueue<>();
       	
       	for(Integer a : scoville) {
       		que.offer(a);
       	}
       	
       	while(que.peek() < K) {
       		
       		int first = que.poll();
       		int second = que.poll();
       		
       		int recipe = first + (second * 2);
       		answer++;
    
       		que.offer(recipe);
       		if(que.size() == 1 && que.peek() < K) {
       			answer = -1;
       			break;
       		}
       		
       	}
       	
       return answer;
    }
	
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println(solution(scoville, K));
	}
}
