import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hi! Let's play a Fizz Buzz game!");
        System.out.println("\nThe rules are super simple: \n - if a number is divisible by 3, the program will mark it with “Fizz” word; \n" +
                " - if a number is divisible by 5, the program will mark it with “Buzz” word;\n" +
                " - if a number is divisible by both, the program will mark it with “Fizz Buzz” word.");

        System.out.println("\n Please enter a number you want to count to: ");
        int number = scan.nextInt();

        System.out.println("\nAnd here is the result: ");

        for (int i = 0; i<=number; i++){

            if (i%3 == 0 && i%5 == 0){
                System.out.println(i + " Fizz Buzz");
            }else if(i%3 == 0){
                System.out.println(i + " Fizz");
            }else if(i%5 == 0){
                System.out.println(i + " Buzz");
            }else{
                System.out.println(i);
            }

        }

    }
}
