package lession_02;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a Integer number: ");
        int userInput = scanner.nextInt();
        String msg = (userInput % 2 == 0)? "User inputted an even number" : "User inputted an odd number";
        System.out.println(msg);
    }
}
