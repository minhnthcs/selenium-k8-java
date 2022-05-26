package lession_03;

public class Lab3_2 {

     /**
     * Finding maximum value/minimum value from an integer array
     *
     *     int[] intArr = {1, 2, 3, 4, 5};
     *
     *     Minimum: 1
     *     Maximum: 5
     */

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 5, 10, 35, -60, 15, 52};
        int max = myArray[0];
        int min = myArray[0];

        System.out.printf("Array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%d ", myArray[i]);
        }
        System.out.printf("\n");

        for (int i = 0; i < myArray.length; i++) {
            min = min > myArray[i]? myArray[i] : min;
            max = max < myArray[i]? myArray[i] : max;

        }

        System.out.printf("Minimum: %d\n", min);
        System.out.printf("Maximum: %d", max);

    }
}
