package lession_03;

public class Lab3_4 {

    /**
     * Merge 2 SORTED integer array into one SORTED array
     *
     *     Array 01: {1, 12, 16, 28, 34}
     *     Array 02: {1, 13, 16, 27, 99}
     *
     *     Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
     * */

    public static void main(String[] args) {
        int[] arr1 = {5, 8, 2, 12, 16, 28, 34};
        int[] arr2 = {1, 13, 16, 27, 99, 90, 10};

        int resultArrayLength = arr1.length + arr2.length;
        int[] resultArray = new int[resultArrayLength];

        // append arr1 to result array
        for (int i = 0; i < arr1.length; i++) {
            resultArray[i] = arr1[i];
        }

        // append arr2 to result array
        for (int i = arr1.length; i < resultArray.length; i++) {
            resultArray[i] = arr2[i - arr1.length];
        }

        // sort the result array
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = i + 1; j < resultArray.length; j++){
                if (resultArray[j] < resultArray[i]){
                    int tmp = resultArray[i];
                    resultArray[i] = resultArray[j];
                    resultArray[j] = tmp;
                }
            }
        }

        // print the result
        System.out.printf("Array 01: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d ", arr1[i]);
        }
        System.out.println("\n");

        System.out.printf("Array 02: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%d ", arr2[i]);
        }
        System.out.println("\n");

        System.out.printf("Merged sorted array: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.printf("%d ", resultArray[i]);
        }
    }
}
