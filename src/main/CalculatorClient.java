package main;

/**
 * Created with IntelliJ IDEA.
 * User: samanthamahony
 * Date: 11/18/13
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorClient {

    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();

        System.out.println("The answer to 3 + 5 is " + myCalculator.addition(3,5));

        System.out.println("The answer to 5 - 3 is " + myCalculator.subtraction(5,3));


    }
}
