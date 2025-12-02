class Outer_demo {
    public class Inner_demo{
        public void print(){
            System.out.println("this is in inner class");
        }
    }

    void display_inner(){
        Inner_demo inner = new Inner_demo();
        inner.print();
    }
}

// public class InnerClass {
//     public static void main(String args[]){
//         Outer_demo outer = new Outer_demo();
//         outer.display_inner();
//         Outer_demo.Inner_demo inner = outer.new Inner_demo();
//         inner.print();
//     }
// }



// inner class in the function
// public class InnerClass {

//     void my_method(){
//         class MethodInner_demo {
//             public void print(){
//                 System.out.println("This is method inner class ");
//             }
//         }
//         MethodInner_demo inner = new MethodInner_demo();
//         inner.print();
//     }
//     public static void main(String args[]){
//         InnerClass methodInner = new InnerClass();
//         methodInner.my_method();
//     }
// }


// anonymous class

abstract class AnonymousInner{
    public abstract void my_method();
}

public class InnerClass{
    public static void main(String args[]){
        AnonymousInner  inner = new AnonymousInner(){
            public void my_method(){
                System.out.println(" Example of anonymuos inner class");
            }
        };
        inner.my_method();
    }
}