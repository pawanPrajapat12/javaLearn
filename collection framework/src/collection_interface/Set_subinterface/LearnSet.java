import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet{
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();   // jis order me element dalenge usme nhi milenge 
        // Set<Integer> set = new LinkedHashSet<>();  // jis order me element dalenge usime milenge
        Set<Integer> set  =  new TreeSet<>(); // yeh element ko sorted order me deta hai
        set.add(23);
        set.add(264);
        set.add(223);
        set.add(25);
        set.add(232);

        System.out.println(set);
        set.remove(264);
        set.remove(2642345);
        System.out.println(set);

        System.out.println(set.contains(25));

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("pawan", 32));
        studentSet.add(new Student("harsh", 322));
        studentSet.add(new Student("pawan", 32));

        Student s1 = new Student("pawan", 32);
        Student s2 = new Student("harsh", 32);
        System.out.println(s1.equals(s2));
        System.out.println(studentSet);
    }
}