package hellgorithm;

public class DfsBfs {
	static int answer=0;
    static int TARGET=0;
	/*public int solution(int[] numbers, int target) {
        check(numbers, 0, 0);
        return answer;
    }*/
    public static void main(String[] args){
        //int[] numbers = {1,2,3};
        //rec(numbers, 0, 0);
        //System.out.println(answer);
    	
    	int[][] computers = { {1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
    	System.out.println(solution(3, computers));
    }
    static void rec(int[] numbers, int sum, int index){

        if(index == numbers.length){
            if(sum==TARGET) answer++;
            return;
        }

        rec(numbers, sum+numbers[index], index+1);
        rec(numbers, sum-numbers[index], index+1);
    }
	
    
    static boolean[][] link;
	public static void dfs(int[][] computers, int idx, int n) {
		for(int i = 0; i < n; i++) {			
			if(computers[idx][i] == 1 && !link[idx][i]) {
				link[idx][i] = link[i][idx] = true;
				dfs(computers, i, n);
			}
		}
	}
	
	static int solution(int n, int[][] computers) {
		int answer = 0;
		link = new boolean[n][n];
		
        for(int i = 0; i < n; i++) {
        	if(!link[i][i]) {
        		dfs(computers, i, n);
        		answer++;
        	}
        }
		return answer;
    }
    
}
