import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        int num;
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número que quieres que transforme a factorial: ");
        num = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
