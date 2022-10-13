package 힙_우선순위큐;
import java.util.*;
public class lev_03_이중우선순위큐 {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ;i<operations.length;i++){
            StringTokenizer st = new StringTokenizer(operations[i]);
            String command = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if(command.equals("D")&&minpq.size()==0){
                continue;
            }

            if(command.equals("I")){
                minpq.add(num);
                maxpq.add(num);
                continue;
            }
            if(num>=0){
                int num1 = maxpq.peek();
                minpq.remove(num1);
                maxpq.poll();
                continue;
            }
            else{
                int num2 = minpq.peek();
                maxpq.remove(num2);
                minpq.poll();
                continue;
            }
        }
        if(minpq.size()==0 || maxpq.size()==0){
            answer[0]=0;
            answer[1]=0;
            return answer;
        }
        answer[0]=maxpq.peek();
        answer[1]=minpq.peek();


        return answer;
    }
}
