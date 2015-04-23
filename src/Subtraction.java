/**
 * Created by ricardo on 4/23/2015.
 */
public class Subtraction {

    private Fraction fraction1;
    private Fraction fraction2;
    private Fraction answer;

    // Constructor
    public Subtraction(Fraction fraction1, Fraction fraction2) {
        this.fraction1 = fraction1;
        this.fraction2 = fraction2;
        this.answer = new Fraction();
        Calculate();
    }

    // perform the calculation
    public void Calculate() {
        answer.setNumerator((fraction1.getNumerator() * fraction2.getDenominator()) - (fraction2.getNumerator() * fraction1.getDenominator()));
        answer.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
    }

    // display the answer
    public void display() {
        Fraction.displayAnswer("Subtraction", "-", fraction1, fraction2, answer);
    }

}