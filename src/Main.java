import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br ;
       br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       int[] arr1 = new int[N];
       int[] arr2 = new int[N];
       StringTokenizer st = new StringTokenizer(br.readLine());
       for(int i = 0 ; i<N;i++){
        arr1[i]= Integer.parseInt(st.nextToken());
       }
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N;i++){
            arr2[i]=Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i<N;i++){
            if(arr1[i]==1){
                if(arr2[i]==1) System.out.println("D");
                else if(arr2[i]==2) System.out.println("B");
                else System.out.println("A");
            }
            else if(arr1[i]==2){
                if(arr2[i]==1) System.out.println("A");
                else if(arr2[i]==2) System.out.println("D");
                else System.out.println("B");
            }
            else{
                if(arr2[i]==1) System.out.println("B");
                else if(arr2[i]==2) System.out.println("A");
                else System.out.println("D");
            }

        }

    }

}