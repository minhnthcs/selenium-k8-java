package lession_02;

import java.util.Scanner;

public class Lab2_1 {

    public static void main(String[] args) {
        final float MAX_UNDER_WEIGHT = 18.5f;
        final float MAX_NORMAL_WEIGHT = 24.9f;
        final float MAX_OVER_WEIGHT = 29.9f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight(kg): ");
        float weight = scanner.nextFloat();
        System.out.println("Please in put your height(m): ");
        float height = scanner.nextFloat();

        double BMI = weight / (height * height);

        if (BMI < MAX_UNDER_WEIGHT){
            System.out.printf("Your BMI index is %f: Under Weight", BMI);
        }else if (BMI > MAX_UNDER_WEIGHT && BMI <= MAX_NORMAL_WEIGHT){
            System.out.printf("Your BMI index is %f: Normal Wight", BMI);
        }else if (BMI > MAX_NORMAL_WEIGHT && BMI < MAX_OVER_WEIGHT){
            System.out.printf("Your BMI index is %f: Over Weight", BMI);
        }else {
            System.out.printf("Your BMI index is %f: Obesity", BMI);
        }
    }
}
