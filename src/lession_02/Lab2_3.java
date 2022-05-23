package lession_02;

import java.util.Scanner;

public class Lab2_3 {

    public static void main(String[] args) {
        final float MAX_UNDER_WEIGHT_BMI = 18.5f;
        final float MAX_NORMAL_WEIGHT_BMI = 24.9f;
        final float MAX_OVER_WEIGHT_BMI = 29.9f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight(kg): ");
        float weight = scanner.nextFloat();
        System.out.println("Please in put your height(m): ");
        float height = scanner.nextFloat();

        double BMI = weight / (height * height);

        float minWeightForNormalBMI = MAX_UNDER_WEIGHT_BMI * (height * height);
        float maxWeighForNumberBMI = MAX_NORMAL_WEIGHT_BMI * (height * height);

        if (BMI < MAX_UNDER_WEIGHT_BMI){
            System.out.printf("Your BMI index is %f: Under Weight\n", BMI);
            System.out.printf("You need  to increase weight in range (%fkg : %fkg) to have normal BMI", (minWeightForNormalBMI - weight), (maxWeighForNumberBMI - weight));
        }else if (BMI > MAX_UNDER_WEIGHT_BMI && BMI <= MAX_NORMAL_WEIGHT_BMI){
            System.out.printf("Your BMI index is %f: Normal Wight\n", BMI);
        }else if (BMI > MAX_NORMAL_WEIGHT_BMI && BMI < MAX_OVER_WEIGHT_BMI){
            System.out.printf("Your BMI index is %f: Over Weight\n", BMI);
            System.out.printf("You need to decrease weight in range (%fkg : %fkg) to have normal BMI", (weight - maxWeighForNumberBMI), (weight - minWeightForNormalBMI));
        }else {
            System.out.printf("Your BMI index is %f: Obesity\n", BMI);
            System.out.printf("You need to decrease weight in range (%fkg : %fkg) to have normal BMI", (weight - maxWeighForNumberBMI), (weight - minWeightForNormalBMI));
        }
    }
}
