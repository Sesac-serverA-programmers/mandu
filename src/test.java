import java.util.*;
class test {
    static ArrayList<String> dic;
    static String[] mo= {"A","E","I","O","U"};


    public int solution(String word) {
        int answer = 0;
        ArrayList<String> dic = new ArrayList<>();
        dic.add(recur(""));
        for(String s : dic){
            if(s.equals(word)){
                break;
            }
            answer++;

        }
        return answer;
    }


    public static String  recur(String str){
        if(str.length()==5) return str;

        else{
            for(int i = 0 ;i<mo.length;i++){
                String newStr  = str + mo[i];
                return recur(newStr);
            }

        }

        return str;
    }


}