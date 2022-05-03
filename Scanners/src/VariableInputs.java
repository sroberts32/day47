package day47.Scanners.src;

import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String string = scanner.nextLine();

        System.out.println("Enter an integer:");
        // int integer = scanner.nextInt();
        int integer = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter a double:");
        // double val = scanner.nextDouble();
        double val = Double.valueOf(scanner.nextLine());

        System.out.println("Enter a boolean value:");
        // boolean boo = scanner.nextBoolean();
        boolean boo = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is: " + string);
        System.out.println("Your integer is: " + integer);
        System.out.println("Your double is: " + val);
        System.out.println("Your boolean is: " + boo);
        scanner.close();
    }
}

