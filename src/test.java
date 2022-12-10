import java.util.*;
import java.io.*;
public class test {
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
         dp = new Integer[1002];
        dp[1]=1;
        dp[2]=2;

     for(int i = 3 ; i <=N;i++){
         dp[i]=(dp[i-1]+dp[i-2])%10007;
     }
        System.out.println(dp[N]%10007);


    }

    }


