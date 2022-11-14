import java.io.*;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp = "a b c d e f";
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }

}
