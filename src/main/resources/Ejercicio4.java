import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        float lado;
        float area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el lado: ");
        lado = scanner.nextFloat();
        scanner.close();

        area = lado * lado;

        System.out.println("El area es de: " + area);
    }
}
