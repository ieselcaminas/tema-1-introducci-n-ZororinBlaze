import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el año: ");
        year = scanner.nextInt();
        scanner.close();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Es un año bisiesto.");
        }else{
            System.out.println("No es un año bisiesto.");
        }
    }
}
