import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int K = 7; // return 2
		System.out.println(new Solution().solution(scoville, K));
	}

}
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int s : scoville)
        	q.add(s);
        while (q.peek() < K && q.size() > 1) {
        	q.add(q.poll() + q.poll()*2);
        	answer++;
        }
        if (q.size() == 1 && q.peek() < K)
        	return -1;
        return answer;
    }
}