import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        int num;
        String cadena = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un número: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            cadena = cadena + i + " ";
            System.out.println(cadena);
        }
    }
}
