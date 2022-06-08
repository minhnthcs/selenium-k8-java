package lession_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringUtils {

    private String givenString = "";

    public StringUtils(String givenString) {
        this.givenString = givenString;
    }

    public void convertHoursMinutes2Minutes(){
        int minutes = 0;
        int hours = 0;
        String[] hoursAndMinutesArr = this.givenString.split("and");
        hours = Integer.parseInt(hoursAndMinutesArr[0].replaceAll("[^0-9]",""));
        minutes = Integer.parseInt(hoursAndMinutesArr[1].replaceAll("[^0-9]","")) + hours * 60;

        System.out.printf("Total minutes are: %d", minutes);
    }

    public void inputPass(){
        int numberOfInput = 0;
        do {
            System.out.println("Please input correct password !!!");
            System.out.printf("You have %d times to try !!!\n", (3 - numberOfInput));
            Scanner scanner = new Scanner(System.in);
            String inputPassword = scanner.next();
            if (inputPassword.equals(this.givenString)){
                System.out.println("Correct Password !!!");
                break;
            }
            System.out.println("Incorrect Password !!!");
            numberOfInput ++;
        }while (numberOfInput < 3);
    }

    public void digitsExtract(){
        StringBuilder onlyDigitString = new StringBuilder();
        System.out.println(this.givenString);
        List<Character> onlyDigits = new ArrayList<>();
        char[] charArr = this.givenString.toCharArray();
        for (char c : charArr) {
            if (Character.isDigit(c)){
                onlyDigits.add(c);
            }
        }

        // convert list of char to String using StringBuilder class
        for (Character c : onlyDigits) {
            onlyDigitString.append(c);
        }

        System.out.println(onlyDigitString);
    }

    public void checkUrl(){
        System.out.println(this.givenString);
        String[] urlSplitter = this.givenString.split("://");
        String securityProtocol = urlSplitter[0];
        String domainName = urlSplitter[1];
        if (securityProtocol.equals("https")){
            System.out.println("The url are https");
        }else if(securityProtocol.equals("http")){
            System.out.println("The url are http");
        }else {
            System.out.println("Invalid url security protocol");
        }

        if (domainName.contains(".com")){
            System.out.println("The url domain is .com");
        }else if (domainName.contains(".net")){
            System.out.println("The url domain is .net");
        }else {
            System.out.println("invalid domain name");
        }
    }
}
