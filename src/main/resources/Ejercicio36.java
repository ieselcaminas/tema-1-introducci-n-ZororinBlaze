import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        int num;
        StringBuilder binario = new StringBuilder("00000000");
        int calc;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un número: ");
        num = scanner.nextInt();
        scanner.close();

        if (num > 255){
            System.out.println("El número no puede ser mayor que 255.");
        }else{
            for (int i = binario.length() - 1; i >= 0; i--) {
                calc = num % 2;
                num = num / 2;
                binario.setCharAt(i, (char) (calc + '0'));
            }
        }
        System.out.println(binario);
    }
}
