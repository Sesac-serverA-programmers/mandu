class lev_02_전화번호목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i=0; i<phone_book.length; i++){
            for(int j =0; j<phone_book.length; j++){
                if(phone_book[i].equals(phone_book[j])){
                    continue;
                }
                if(phone_book[j].contains(phone_book[i])==true){
                    answer=false;
                }
            }
        }

        return answer;
    }
}

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i=0; i<phone_book.length; i++){
            String std = phone_book[i];
            for(int j =0; j<phone_book.length; j++){
                if(std.length()>phone_book[j].length()) continue;
                if(std.equals(phone_book[j])) continue;
                if(phone_book[j].startsWith(std)){
                    answer=false;
                }

            }
        }

        return answer;
    }
}
