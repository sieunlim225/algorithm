package hellgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueStack {
	
	public static void QueueCommand() {
		//백준 10845 - https://www.acmicpc.net/problem/10845
				Scanner sc = new Scanner(System.in);
				Queue<Integer> que = new LinkedList<Integer>();
				int pushInt = -1;
				
				while(true){
					
					String input = sc.next();
					
			     if(input.equals("push")){
			    	 //push X: 정수 X를 큐에 넣는 연산이다.
			    	 pushInt = sc.nextInt();
			    	 if(pushInt != 0){
			    		 que.offer(pushInt);
			    		 System.out.println("inserted");
			    	 }
			     }else if(input.equals("pop")){
			    	 //pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			    	 System.out.println(que.isEmpty()?-1:que.poll());
			     }else if(input.equals("size")){
			    	 //size: 큐에 들어있는 정수의 개수를 출력한다.
			    	 System.out.println(que.size());
			     }else if(input.equals("empty")){
			    	 //empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
			    	 System.out.println(que.isEmpty()?1:0);
			     }else if(input.equals("front")){
			    	 //front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			    	 System.out.println(que.peek()!=null?que.peek():-1);
			     }else if(input.equals("back")) {
			    	 //back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			    	 System.out.println(que.size()==0?-1:pushInt);
			    	 //다른방법
			    	 
			     }
			     
			   }
				   
	}
	
	/*public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> que = new LinkedList<Integer>();
        Queue<Integer> que2 = new LinkedList<Integer>();
        for(int j = 0 ; j < truck_weights.length; j++) {
			que.add(j);
		}
        
        for (int i = 0; i < bridge_length; i++) {
        	que.size()
        	
        			answer++;
        			System.out.println(i);
        			if(i == bridge_length) {
        				System.out.println(i);
        				que.poll();
        			}
        		
       
			
		}
	
		
	
        return answer;
    }*/
	
	public static void main(String[] args) {
		int [] truck_weights = { 7,4,5,6 };
		//System.out.println(solution(2, 10 , truck_weights));
		//https://programmers.co.kr/learn/courses/30/lessons/42583
//		트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 
//		모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 
//		트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
//		※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
//
//		예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
		
		
		
		
	}

}
