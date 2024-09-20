import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        num = scanner.nextInt();
        scanner.close();

        if (num > 0){
            System.out.println("El número es positivo.");
        } else{
            System.out.println("El número es negativo.");
        }
    }
}
