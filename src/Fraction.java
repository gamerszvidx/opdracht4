/**
 * Created by ricardo on 4/23/2015.
 */
public class Fraction {

    private int Numerator; // x
    private int Denominator; // y

    public int getNumerator() {
        return Numerator;
    }

    public void setNumerator(int Numerator) {
        this.Numerator = Numerator;
    }

    public int getDenominator() {
        return Denominator;
    }

    public void setDenominator(int Denominator) {
        this.Denominator = Denominator;
    }

    // This method is used to display fractions
// Some kind of processing also
    public void display() {

        // 0/y and x/1 types
        if (Numerator == 0 || Denominator == 1) {
            System.out.print(Numerator);
        }

        // -x/-y and x/-y types
        else {
            if ((Numerator < 0 && Denominator < 0) || (Numerator > 0 && Denominator < 0)) {
                Numerator *= -1;
                Denominator *= -1;
            }

            // x/x type
            if (Numerator == Denominator) {
                System.out.print(Numerator);
                return;
            }

            System.out.print(this.Numerator + "/" + this.Denominator);
        }

    }
    public static void displayAnswer(String operation, String operator,
                                     Fraction fraction1, Fraction fraction2, Fraction answer) {
        System.out.print(operation + "  : ");
        fraction1.display();
        System.out.print(" " + operator + " ");
        fraction2.display();
        System.out.print(" = ");
        answer.display();
        System.out.println("\n");
    }
    public static void insertNumerator() {
        System.out.print("Numerator : ");
    }

    // This message is use to tell user to input a value for denominator
    public static void inputDenominator() {
        System.out.print("Denominator   : ");
    }

    // This method is used to get line of space
    public static void newLine() {
        System.out.println("\n");
    }

    // This message is used when user input something miss match
    public static void inputError(Exception e) {
        newLine();
        System.out.println("Input Error: " + e.toString());
        System.out.println("Closing application ...");
        System.out.println("Fraction app is closed.");
    }

    // This message is used when user input 0 for Denominator in a fraction
    public static void DenominatorCannotBeZero() {
        System.out.println("Input Error: Denominator Cannot be zero");
        newLine();
    }




}