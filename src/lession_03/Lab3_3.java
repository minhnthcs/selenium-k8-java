package lession_03;

public class Lab3_3 {

    /**
     * Sort an integer array from min to max
     *
     *     Input: {12, 34, 1, 16, 28}
     *     Expected output: {1, 12, 16, 28, 34}
     *
     */

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 5, 10, 35, -60, 15, 52};

        // Before sorting
        System.out.printf("Array before sorted: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%d ",myArray[i]);
        }
        System.out.printf("\n");

        // Sorting the array
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++){
                if (myArray[j] < myArray[i]){
                    int tmp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = tmp;
                }
            }
        }

        // After sorting
        System.out.printf("Array after sorted: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%d ",myArray[i]);
        }
    }
}
