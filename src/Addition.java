public class Addition {

    private Fraction fraction1;
    private Fraction fraction2;
    private Fraction answer;

    // Constructor
    public Addition(Fraction fraction1, Fraction fraction2) {
        this.fraction1 = fraction1;
        this.fraction2 = fraction2;
        this.answer = new Fraction();
        calculate();
    }

    // perform the calculation
    public void calculate() {
        answer.setNumerator((fraction1.getNumerator() * fraction2.getDenominator())
                + (fraction2.getNumerator() * fraction1.getDenominator()));
        answer.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
    }

    // display the answer
    public void display() {
        Fraction.displayAnswer("Addition", "+", fraction1, fraction2, answer);
    }

}