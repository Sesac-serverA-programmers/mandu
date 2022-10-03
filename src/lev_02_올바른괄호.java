import java.util.*;
public class lev_02_올바른괄호 {
    boolean solution(String s) {
        boolean answer = false;

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i<s.length();i++){

            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }

            else if(s.charAt(i)==')'){
                if(stack.isEmpty()){
                    stack.push(s.charAt(i));
                }
                char temp = stack.peek();
                if(temp=='('){
                    stack.pop();
                }
            }

        }
        if(stack.isEmpty()) answer=true;

        return answer;
    }
}
