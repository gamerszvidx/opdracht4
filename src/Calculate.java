/**
 * Created by ricardo van der spek on 4/23/2015.
 */
public class Calculate {
    private Fraction answer;

    public void multiplicate(Fraction fraction1, Fraction fraction2){
        this.answer = new Fraction();
        answer.setNumerator(fraction1.getNumerator() * fraction2.getNumerator());
        answer.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
        Fraction.displayAnswer("Multiplication", "*", fraction1, fraction2, answer);
    }
    public void divide(Fraction fraction1, Fraction fraction2){
        this.answer = new Fraction();
        answer.setNumerator(fraction1.getNumerator() * fraction2.getDenominator());
        answer.setDenominator(fraction1.getDenominator() * fraction2.getNumerator());
        if (fraction2.getNumerator() == 0) {
            System.out.println("Division : Cannot divide by zero!");
            return;
        } else {
            // display the answer
            Fraction.displayAnswer("Division", "/", fraction1, fraction2,
                    answer);
        }
    }
    public void subtract(Fraction fraction1, Fraction fraction2){
        this.answer = new Fraction();
        answer.setNumerator((fraction1.getNumerator() * fraction2.getDenominator()) - (fraction2.getNumerator() * fraction1.getDenominator()));
        answer.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
        Fraction.displayAnswer("Subtraction", "-", fraction1, fraction2, answer);
    }
    public void addit(Fraction fraction1, Fraction fraction2){
        this.answer = new Fraction();
        answer.setNumerator((fraction1.getNumerator() * fraction2.getDenominator())
                + (fraction2.getNumerator() * fraction1.getDenominator()));
        answer.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
        Fraction.displayAnswer("Addition", "+", fraction1, fraction2, answer);
    }
}
