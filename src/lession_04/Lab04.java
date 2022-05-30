package lession_04;

import java.security.SecureRandom;
import java.util.*;


public class Lab04 {

    final static int MAX_SIZE = 10;
    static boolean isContinue = true;

    public static void main(String[] args) {

        int userOption = 0;
        Scanner scanner = new Scanner(System.in);

        while (isContinue){
            createMenu();
            userOption = scanner.nextInt();
            List<Integer> myArrayList = new ArrayList<>();
            SecureRandom rand = new SecureRandom();
            for (int index = 0; index < MAX_SIZE; index++) {
                myArrayList.add(rand.nextInt(10));
            }

            if (userOption == 1){
                printArrayList(myArrayList);
                askContinue();
            }else if (userOption == 2){
                printArrayList(myArrayList);
                findMaxNumber(myArrayList);
                askContinue();
            }else if (userOption == 3){
                printArrayList(myArrayList);
                findMinNumber(myArrayList);
                askContinue();
            }else if (userOption == 4){
                printArrayList(myArrayList);
                searchNumber(myArrayList);
                askContinue();
            }else {
                isContinue = false;
            }
        }

    }

    private static void searchNumber(List<Integer> arrayList) {
        int countExist = 0;
        List<Integer> listExistIndexes = new ArrayList<>();
        System.out.print("Please input your number to search: ");
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
        for (int index = 0; index < arrayList.size(); index++) {
            if (arrayList.get(index) == myNumber){
                countExist++;
                listExistIndexes.add(index);
            }
        }
        if (countExist == 0){
            System.out.printf("The number %d not exist in the list", myNumber);
        }else{
            System.out.printf("The number %d is found in the list at indexes: ", myNumber);
            for (Integer listExistIndex : listExistIndexes) {
                System.out.printf("%d ", listExistIndex);
            }
        }
    }

    private static void findMinNumber(List<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int index = 0; index < arrayList.size(); index++) {
            if (arrayList.get(index) <= min){
                min = arrayList.get(index);
            }
        }
        System.out.printf("Min number: %d", min);
    }

    private static void findMaxNumber(List<Integer> arrayList) {
        int max = arrayList.get(0);
        for (int index = 0; index < arrayList.size(); index++) {
            if (arrayList.get(index) >= max){
                max = arrayList.get(index);
            }
        }
        System.out.printf("Max number: %d", max);
    }


    private static void createMenu() {
        System.out.println("Please choose your option from the below MENU !!!");
        System.out.println("\t\t=======MENU=======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("5. Exit");
        System.out.print("Your option: ");
    }

    private static void askContinue(){
        System.out.printf("\n");
        System.out.print("Do you want to continue play? Press Y to continue, or N to exit the game: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().equalsIgnoreCase("y")){
            isContinue = true;
        }else {
            isContinue = false;
        }
    }

    private static void printArrayList(List<Integer> arrayList){
        System.out.print("Your random array list: ");
        for (Integer integer : arrayList) {
            System.out.printf("%d ", integer);
        }
        System.out.println("\n");
    }
}
