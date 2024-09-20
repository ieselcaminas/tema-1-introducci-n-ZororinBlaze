import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el valor de x: ");
        x = scanner.nextInt();
        System.out.println("Introduce el valor de y: ");
        y = scanner.nextInt();
        scanner.close();

        if (x > y){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
    }
}
