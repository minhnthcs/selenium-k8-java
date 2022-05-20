package lession_02;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        final int EXPECTED_TIME = 7;
        Scanner scanner = new Scanner(System.in);
        int arrivalTime = scanner.nextInt();
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;
//        if (isHeOnTime){
//            System.out.println("Let's talk");
//        }else{
//            System.out.println("Write a letter");
//        }

        String msg = isHeOnTime ? "Let's talk" : "Write a letter";

    }
}
