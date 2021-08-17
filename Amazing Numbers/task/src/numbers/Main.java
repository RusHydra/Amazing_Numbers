package numbers;

import java.util.Scanner;


public class Main {
    static boolean powerOn = true;
    static String input;
    static Long num = 0L;
    static boolean isNatural = true;
    static boolean buzz = false;
    static boolean duck = false;
    static boolean odd = false;
    static boolean even = false;
    static boolean palindromic = false;

    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println();
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter 0 to exit.");

        while (powerOn) {
            clearVariables();
            System.out.println();
            System.out.print("Enter a request: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.next();
            num = Long.parseLong(input.trim());

            if (num == 0) {
                powerOn = false;
                System.out.println();
                System.out.println("Goodbye!");
            } else {
                checkNatural(num);
                if (isNatural) {
                    checkParity(num);
                    checkBuzz(num);
                    checkDuck(input);
                    checkPalindromic(input);
                    printReport(input);
                }
            }
        }
    }

    static void checkNatural (Long input) {
        if (input < 1) {
            System.out.println();
            System.out.println("The first parameter should be a natural number or zero.");
            isNatural = false;
        }
    }

    static void checkParity(Long input) {
        if (input % 2 == 0) {
           even = true;
        } else {
            odd = true;
        }
    }

    static void checkBuzz (Long input) {
        if ((input % 10 == 7) || (input % 7 == 0)) {
            buzz = true;
        } else {
            buzz = false;
        }
    }

    static void checkDuck (String input) {
        if (input.contains("0")) {
            duck = true;
        } else if (input.charAt(0) == 0) {
            duck = false;
        } else {
            duck = false;
        }
    }

    static void checkPalindromic (String input) {
        if (input.equals(new StringBuilder(input).reverse().toString())) {
            palindromic = true;
        } else {
            palindromic = false;
        }
    }

    static void printReport (String input) {
        System.out.println("Properties of " + input);
        System.out.println("        " + "even: " + even);
        System.out.println("         " + "odd: " + odd);
        System.out.println("        " + "buzz: " + buzz);
        System.out.println("        " + "duck: " + duck);
        System.out.println(" " + "palindromic: " + palindromic);
    }

    static void clearVariables () {
        num = 0L;
        isNatural = true;
        buzz = false;
        duck = false;
        odd = false;
        even = false;
        palindromic = false;
    }
}



