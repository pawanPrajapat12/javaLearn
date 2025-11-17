import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(number, 3);
        System.out.println(index);

        Integer[] numbers = {23, 21, 53, 64, 1, 64};
        Arrays.sort(numbers);
        for(int i: numbers){
            System.out.println(i + " ");
        }
    }
}
