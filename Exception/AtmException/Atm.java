package AtmException;

import java.util.Scanner;


public class Atm {
    public static void main(String[] args) {
        int pin = 1234;
        try {
            checkpin(pin);
        } catch (PinNotMatchException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkpin(int pin) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (count < 3) {
            System.out.println("Enter the pin:");
            int ch_pin = sc.nextInt();
            if (ch_pin == pin) {
                System.out.println("Welcome to the bank");
                sc.close();
                return;
            } else {
                count++;
                System.out.println("Pin not match.enter again");
            }
        }

        sc.close();
        throw new PinNotMatchException("Too many failed attempts. Access denied.");
    }
}
