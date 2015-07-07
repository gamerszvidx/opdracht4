/**
 * Created by ricardo on 4/7/2015.
 */

import java.io.*;
import java.util.Scanner;

public class FractionsMain {
    Fraction fraction1 = new Fraction(); // first fraction
    Fraction fraction2 = new Fraction(); // second fraction
    private Scanner keyboard = new Scanner(System.in);
    private int choice;
    public Calculate c = new Calculate();
    BufferedReader br = null;
    BufferedWriter bw = null;
    PrintWriter out;
    String input = "C:\\Users\\ricardo van der spek\\Downloads\\opdracht4\\invoer.txt";
    String output = "C:\\Users\\ricardo van der spek\\Downloads\\opdracht4\\output.txt";
    private String line = " ";
    private String splitValue = "\\s | / |\\s*[a-z]+\\s*";

    public static void main(String args[]) throws IOException {
        FractionsMain f = new FractionsMain();
        f.Run();;
    }

    public void Run() throws IOException {
        System.out.println("Would you like to use user input(1) or file input(2)? press 1 or 2");
        int inputchoice = keyboard.nextInt();
        switch(inputchoice){
            case 1: userinput();
                    break;
            case 2: fileinput();
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
                c.addit(fraction1, fraction2);
                break;
            case 2:
                c.subtract(fraction1, fraction2);
                break;
            case 3:
                c.multiplicate(fraction1, fraction2);
                break;
            case 4:
                c.divide(fraction1, fraction2);
                break;
        }
    }

    public void userinput() {

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
    public void fileinput() throws IOException {
        readfile();
    }
    public void readfile() throws IOException {
        out = new PrintWriter(output);
        bw = new BufferedWriter(out);
        br = new BufferedReader(new FileReader(input));

        while((line = br.readLine()) != null){
            String[] Input = line.split(splitValue);

            if (Input.length == 4){
                fraction1.setNumerator(Integer.parseInt(Input[0]));
                fraction1.setDenominator(Integer.parseInt(Input[1]));
                fraction2.setNumerator(Integer.parseInt(Input[2]));
                fraction2.setDenominator(Integer.parseInt(Input[3]));
                usage(fraction1, fraction2);


            }
        }
    }

}