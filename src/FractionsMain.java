/**
 * Created by ricardo on 4/7/2015.
 */
import java.util.Scanner;
public class FractionsMain {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {

        Fraction fraction1 = new Fraction(); // first fraction
        Fraction fraction2 = new Fraction(); // second fraction


        // get user inputs for fraction one and validate them
        do {
            System.out.println("Enter values for fraction one");
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
            System.out.println("Enter values for fration two");
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

        // Addition
        Addition addition = new Addition(fraction1, fraction2);
        addition.display();

    }

}