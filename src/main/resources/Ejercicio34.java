import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int sumaSucesiva = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un número: ");
        num1 = scanner.nextInt();
        System.out.println("Por cuánto lo quieres multiplicar?: ");
        num2 = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= num2; i++){
            sumaSucesiva = sumaSucesiva + num1;
        }
        System.out.println("Resultado: " + sumaSucesiva);
    }
}
