import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celcius: ");
        double temperature = scanner.nextDouble();
        temperature = temperature * 1.8 + 32;
        System.out.print("Temperature in Fahrenheit: " + temperature);
    }
}