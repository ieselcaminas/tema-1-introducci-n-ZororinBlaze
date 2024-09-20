import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        int num;
        boolean primo = true;

        for (int a = 3; a <= 100; a += 2) {
            num = a;
            primo = true;
            if (num % 2 != 0) {
                for (int i = 3; i <= (num / 2); i += 2) {
                    if (num % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo){
                System.out.println("El número " + num + " es primo.");
            }
        }

    }
}
