package challenges;

public class Recursion {


    public static void main(String[] args) {
        System.out.println(sumNumbers(2));
        System.out.println(factorial(3));
    }

    public static int sumNumbers(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number + sumNumbers(number - 1);
        }
    }

    public static long factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

}