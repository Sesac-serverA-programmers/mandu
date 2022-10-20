import java.util.*;

class lev_01_포켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length/2;

        //Set에 넣어서 종류가 같은 포켓몬 중복없애기
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++) {
            hashSet.add(nums[i]);
        }
        //최대 종류이냐 아니냐
       if(n < hashSet.size()) answer = n;
        else answer = hashSet.size();
        return answer;
    }
}