import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        // Map<String,Integer> number = new HashMap<>();
        Map<String,Integer> number = new TreeMap<>();
        number.put("one", 1);
        number.put("two", 2);
        number.put("three", 3);
        number.put("four", 4);
        // number.put("two", 33);
        System.out.println(number);

        // for (Map.Entry<String, Integer> e : number.entrySet()){
        //     System.out.println(e);
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }
    }    
}
