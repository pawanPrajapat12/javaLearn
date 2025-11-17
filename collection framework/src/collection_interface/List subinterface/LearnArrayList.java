import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class LearnArrayList{
    public static void main (String[] args){
        List<String> studentName = new ArrayList<>();

        // size = n tho yeh size ko (n + n/2 + 1) se increase kr dega  and starting me array ki size 10 hsi
        studentName.add("chetan");
        studentName.add("pooja");
        studentName.add("pawan");
        System.out.println(studentName);
        studentName.add(0, "gyan");
        System.out.println(studentName);
        studentName.add(0, "govindi");
        System.out.println(studentName);

        List<String>list = new ArrayList<>();
        // add method
        list.add("10");
        list.add("11");
        list.add("12");

        System.out.println(list);
        studentName.addAll(0,list);
        System.out.println(list);
        System.out.println(studentName);
        // get method
        System.out.println(studentName.get(1));
        
        
        // remove method
        list.remove(1);
        list.remove(String.valueOf("13"));
        list.set(0, "1000");
        System.out.println(list);

        // for iterate in the list

        for (String element : list) {
            System.out.println(element);
        }

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}