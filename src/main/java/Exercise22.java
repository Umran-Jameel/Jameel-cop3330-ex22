import java.util.*;

public class Exercise22 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[3];

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        arr[0] = in.nextInt();
        System.out.print("Enter the second number: ");
        arr[1] = in.nextInt();
        System.out.print("Enter the third number: ");
        arr[2] = in.nextInt();

        int largest = arr[0];

        for (int i = 1; i < 3; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        System.out.printf("The largest number is %d.\n", largest);


    }
}
