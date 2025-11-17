package array_and_collection_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import collection_interface.Set_subinterface.Student;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(16);
        list.add(13);
        list.add(164);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);

        System.out.println("min element " + Collections.min(list));
        System.out.println("min element " + Collections.max(list));
        System.out.println(Collections.frequency(list, 9));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);


        List<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("pawan", 2));
        listStudents.add(new Student("harsh", 3));
        listStudents.add(new Student("kajol", 1));

        Student s1 = new Student("pawan", 33);
        Student s2 = new Student("harsh", 32);

        // System.out.println(s1.compareTo(s2));
        // Collections.sort(listStudents);
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2){
                return o1.Name.compareTo(o2.Name);
            }
        });
        System.out.println(listStudents);
    }    
}
