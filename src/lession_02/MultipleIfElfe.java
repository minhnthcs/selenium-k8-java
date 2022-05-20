package lession_02;

import java.util.Scanner;

public class MultipleIfElfe {
    public static void main(String[] args) {
        // < 18 || 18 - 55 || > 55
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name: ");
        int clientAge = scanner.nextInt();
        if (clientAge < 18){
            System.out.println("Khong ban !!!");
        } else if (clientAge <= 55){
            System.out.println("Khong gioi han ");
        } else {
            System.out.println("2 chai");
        }

    }
}
