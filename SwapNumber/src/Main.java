import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter a number: ");
        int secondNumber = input.nextInt();

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println(firstNumber + " " + secondNumber);

    }
}