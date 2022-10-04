import java.util.*;
public class lev_02_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        boolean bol = true;
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        //각 기능별로 몇 일이 걸리는지 q에 삽입
        for(int i = 0 ; i<progresses.length;i++){
            int count = 0 ;
            int p = progresses[i];
            int s = speeds[i];
            while(!(p>=100)){
                p+=s;
                count++;
            }
            q.offer(count);
        }
        //ArrayList에 리턴값 저장
        while(!q.isEmpty()){
            int count = 1;
            int std = q.poll();

            while(!q.isEmpty()){
                if(std>=q.peek()){
                    count++;
                    q.poll();
                }
                else{
                    break;
                }
            }
            arrList.add(count);
        }
        //ArrayList to Array
        answer = new int[arrList.size()];
        for(int i = 0 ; i<answer.length;i++){
            answer[i]=arrList.get(i);
        }
        return answer;
    }
}
