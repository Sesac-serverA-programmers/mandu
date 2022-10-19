import java.util.*;
class lev_01_완주하지못한선수 {
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
        for(int i = 0 ; i <participant.length;i++){
            if(map.get(participant[i])>=1){
                answer=participant[i];
                break;
            }
        }



        return answer;
    }
}