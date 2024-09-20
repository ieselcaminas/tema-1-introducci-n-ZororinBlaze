import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int edad;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        edad = scanner.nextInt();
        scanner.close();

        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        }else {
            System.out.println("Eres mayor de edad.");
        }
    }
}
