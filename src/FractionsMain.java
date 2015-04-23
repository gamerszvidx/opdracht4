/**
 * Created by ricardo on 4/7/2015.
 */

import java.util.Scanner;

public class FractionsMain {
    private Scanner keyboard = new Scanner(System.in);
    private int choice;

    public static void main(String args[]) {
        FractionsMain f = new FractionsMain();
        f.Run();

    }

    public void Run() {
        System.out.println("Would you like to use user input(1) or file input(2)? press 1 or 2");
        int inputchoice = keyboard.nextInt();
        switch(inputchoice){
            case 1: userinput();
                    break;
        }

    }

    public void usage(Fraction fraction1, Fraction fraction2) {
        System.out.println("which would you like to use, enter the number:");

        System.out.println("1, Addition");

        System.out.println("2, Subtraction");

        System.out.println("3, Multiplication");

        System.out.println("4, Division");

        choice = keyboard.nextInt();
        switch (choice) {
            // Addition
            case 1:
                addit(fraction1, fraction2);
                break;
            case 2:
                subtract(fraction1, fraction2);
                break;
            case 3:multiplicate(fraction1, fraction2);
                break;
            case 4:
                divide(fraction1, fraction2);
                break;
        }
    }

    public void userinput() {
        Fraction fraction1 = new Fraction(); // first fraction
        Fraction fraction2 = new Fraction(); // second fraction


        // get user inputs for fraction one and validate them
        do {
            System.out.println("Enter numerator and denominator for fraction one");
            Fraction.insertNumerator();
            try {
                fraction1.setNumerator(keyboard.nextInt()); // get user input
            } catch (Exception e) {
                Fraction.inputError(e); // display error
                return;
            }
            Fraction.inputDenominator();
            try {
                fraction1.setDenominator(keyboard.nextInt()); // get user input
            } catch (Exception e) {
                Fraction.inputError(e);
                return;
            }
            if (fraction1.getDenominator() == 0) { // check for x/0 error
                Fraction.DenominatorCannotBeZero();
            }
        } while (fraction1.getDenominator() == 0);

        // Display fraction one
        System.out.print("Fraction one : ");
        fraction1.display();
        Fraction.newLine();

        // get user inputs for fraction two and validate them
        do {
            System.out.println("Enter  numerator and denominator for fration two");
            Fraction.insertNumerator();
            try {
                fraction2.setNumerator(keyboard.nextInt()); // get user input
            } catch (Exception e) {
                Fraction.inputError(e);
                return;
            }
            Fraction.inputDenominator();
            try {
                fraction2.setDenominator(keyboard.nextInt()); // get user input
            } catch (Exception e) {
                Fraction.inputError(e);
                return;
            }
            if (fraction2.getDenominator() == 0) { // check for x/0 error
                Fraction.DenominatorCannotBeZero();
            }
        } while (fraction2.getDenominator() == 0);

        // Display fraction two
        System.out.print("Fraction two : ");
        fraction2.display();
        Fraction.newLine();
        usage(fraction1, fraction2);
    }

}