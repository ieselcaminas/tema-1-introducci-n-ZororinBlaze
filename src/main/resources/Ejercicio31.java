import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        int num;
        String divisores = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un número natural: ");
        num = scanner.nextInt();

        if (num <= 0){
            System.out.println("El número no es natural.");
        }else{
            for(int i = 1; i <= num; i++){
                if (num % i == 0){//Si el resto es 0 significa que ese número es divisible y por lo tanto se acumula
                    divisores = divisores + i + " ";
                }
            }
            System.out.println(divisores);
        }
    }
}
