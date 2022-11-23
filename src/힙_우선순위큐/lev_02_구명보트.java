package 힙_우선순위큐;
import java.util.*;
public class lev_02_구명보트 {
public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque<Integer> dq = new LinkedList<>();
        for(int i:people){
            dq.addLast(i);
        }
        while(!dq.isEmpty()){
            if(dq.peekFirst()+dq.peekLast()<=limit){
                dq.pollFirst();
                dq.pollLast();
                answer++;
            }else{
                dq.pollLast();
                answer++;
            }

        }





        return answer;
    }
}

