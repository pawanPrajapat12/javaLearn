import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("kuta");
        animals.push("horse");
        animals.add(2,"hathi");
        System.out.println(animals);
        System.out.println(animals.pop());
        System.out.println(animals.pop());
        System.out.println(animals.peek());

    }
}
