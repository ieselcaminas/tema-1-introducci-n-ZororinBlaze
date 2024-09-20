import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el número de la tabla de multiplicar: ");
        num = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
