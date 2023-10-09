import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tempC;
        double tempF;
        boolean enteredTemp = true;

        do {
            System.out.println("Please enter a temperature in degrees C to be converted to degrees F:");
            if (scan.hasNextDouble()) {
                tempC = scan.nextDouble();
                tempF = (tempC * 9 / 5) + (32);

                System.out.printf("%-10s %7.2f", "Degrees C:", tempC);
                System.out.printf("\n%-10s %7.2f", "Degrees F:", tempF);
                enteredTemp = false;
            }else{
                System.out.println("you have entered an invalid temperature value. Please try again.");
                scan.nextLine();
            }

        } while (enteredTemp);

    }
}