import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        String binario;
        int decimal = 0;
        int potencia = 0;
        int base = 2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el número binario: ");
        binario = scanner.nextLine();

        for (int i = 0; i < binario.length(); i++) {
            int bit = binario.charAt(i) - '0';
            decimal += (bit* Math.pow(base, potencia));
            potencia++;
        }
        System.out.println(decimal);
    }
}
