import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un número: ");
        num1 = scanner.nextInt();
        System.out.println("Por cuánto lo quieres dividir?: ");
        num2 = scanner.nextInt();
        scanner.close();

        while (num1 >= num2) {
            num1 = num1 - num2;
        }
        System.out.println("Resultado: " + num1);
    }
}
