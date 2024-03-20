package challenges;

public class forExamples {


    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static Integer factorial(int num) {

       Integer total = 1;

       for(int i = 1; i <= num; i ++ ){
           total *= i;
       }
        return total;
    }

}
