import java.util.*;

public class test {
    public static void main(String[] args) {
        HashMap<String,Integer> aa = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();

        aa.put("aa",3);
        aa.put("bb",5);
        aa.put("cc",2);

        for(Integer temp : aa.values()){
            a.add(temp);
        }
        for(Map.Entry<String,Integer> map : aa.entrySet()){

        }


        System.out.println(aa.containsValue(2));
        
    }
}




