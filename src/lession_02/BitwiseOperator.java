package lession_02;

public class BitwiseOperator {
    public static void main(String[] args) {
        if (method1() && method2()){
            System.out.println("\tInside the function");
        }

    }

    private static boolean method2() {
        System.out.println("Method1");
        return true;
    }

    private static boolean method1() {
        System.out.println("Method2");
        return false;
    }
}
