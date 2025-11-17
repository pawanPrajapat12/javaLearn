package collection_interface.Set_subinterface;

import java.util.Objects;

public class Student implements Comparable<Student>{
    public String Name;
    public int Rollno;
    public Student(String name , int rollno){
        this.Name = name;
        this.Rollno = rollno;
    }

    @Override
    public String toString(){
        return "Student{"+ 
                "name='"+ Name + '\'' + 
                ", rollNo=" + Rollno +
                '}';
    }

    @Override
    public boolean equals(Object o){
        System.out.println("equals() called: " + this + "  ↔  " + o);
        if(this == o) {
            System.out.println(" → SAME OBJECT (this == o)");
            return true;
        }

        if(o == null || getClass() != o.getClass()) {
            System.out.println(" → NOT SAME CLASS OR NULL");
            return false;
        }
        Student student = (Student) o;
        boolean result = (Rollno == student.Rollno);
        System.out.println(" → FINAL RESULT (rollno compare): " + result);
        return Rollno == student.Rollno;
    }

    @Override
    public int hashCode(){
        System.out.println(" → hash code " + Objects.hash(Rollno));
         
        return Objects.hash(Rollno);
    }

    @Override 
    public int compareTo(Student that){
        return this.Rollno - that.Rollno;
    }
}
