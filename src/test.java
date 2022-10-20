import java.util.*;
public class test {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> map = new HashMap<>();
        //해쉬맵에 참가자 명단 넣기
        for(int i = 0 ; i <participant.length;i++){
            if(map.get(participant[i])==null){
                map.put(participant[i],1);
                continue;
            }
            map.put(participant[i],map.get(participant[i])+1);
        }

        //완주한사람은 count-1
        for(int i = 0 ; i<completion.length;i++){
            map.put(completion[i],map.get(completion[i])-1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
        }



        for(int i = 0 ; i <participant.length;i++){
            if(map.get(participant[i])>=1){
                answer=participant[i];
                break;
            }
        }



        return answer;
    }
    public static void main(String[] args){

        String[] part = {"marina", "josipa", "nikola","vinko","filipa"};
        String[] comp = {"josipa", "filipa","marina","nikola"};

        test sol = new test();
        System.out.println(sol.solution(part, comp));
    }

}
