package gr.aueb.cf.calc;

public class Main {
    public static void main(String[] args) {

    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static int div(int num1, int num2){
        try {
            return num1 / num2;
        } catch (ArithmeticException e){
            System.err.println("The denominator must not be 0");
            throw e;
        }
    }
}
