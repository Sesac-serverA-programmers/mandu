import java.util.*;
class lev_01_모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};

        int a = 0;
        int b = 0;
        int c = 0;


        for(int i = 0; i<answers.length;i++){
            if(first[ i % 5]==answers[i]){
                a++;
            }
            if(second[i % second.length ]==answers[i]){
                b++;
            }
            if(third[ i % 10]==answers[i]){
                c++;
            }
        }
        int max = Math.max(Math.max(a,b),c);

        //최대값이랑 1번2번3번이 맞춘 개수가 같다면 답에넣기
        ArrayList<Integer> tmp = new ArrayList<>();
        if(a==max){
            tmp.add(1);
        }
        if(b==max){
            tmp.add(2);
        }
        if(c==max){
            tmp.add(3);
        }
        //ArrayList to Array
        answer = new int[tmp.size()];
        for(int i = 0; i <tmp.size();i++){
            answer[i]=tmp.get(i);
        }
        return answer;
    }



}