import java.util.Arrays;

public class NumericArray {
    public static void main(String[] args) {
        int myArray[] = { 31789, 2035, 1899, 1456, 2013 };
        Arrays.sort(myArray);
        int sum = 0;
        for (int i : myArray) {
            sum += i;
        }
        ;
        double avg = sum / (double) myArray.length;
        System.out.println(Arrays.toString(myArray));
        System.out.println("sum:" + sum);
        System.out.println("avg:" + avg);
    }
}
