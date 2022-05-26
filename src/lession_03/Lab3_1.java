package lession_03;

public class Lab3_1 {


     /**
     * Count how many odd, even number(s) in an integer array
     *
     *     int[] intArr = {1, 2, 3, 4, 5};
     *
     *     Even numders: 2
     *     Odd numbers: 3
     *
     * */


    public static void main(String[] args) {
        int evenCount = 0;
        int[] myArray = {1, 2, 3, 5, 10, 35, 60, 15, 52};

        for (int index = 0; index < myArray.length; index++) {
            evenCount = myArray[index] % 2 == 0? (evenCount + 1) : evenCount;
        }
        System.out.printf("Array: ");

        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%d ", myArray[i]);
        }
        System.out.printf("\n");

        System.out.printf("Odd numbers: %d\n", myArray.length - evenCount);
        System.out.printf("Even numbers: %d\n", evenCount);
    }
}
