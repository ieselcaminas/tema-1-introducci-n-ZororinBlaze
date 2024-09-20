import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        int num;
        int pos = 0;
        int neg = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Dime un número: ");
            num = scanner.nextInt();
            if (num < 0){
                neg++;
            }else{
                pos++;
            }
        }
        scanner.close();
        System.out.println("Hay un total de " + pos + " números positivos y un total de " + neg + " números negativos.");
    }
}
