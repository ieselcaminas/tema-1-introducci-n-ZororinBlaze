public class Ejercicio33 {
    public static void main(String[] args) {
        double n1 = 1;
        double n2 = 1;
        String cadenaNum = n1 + ", " + n2 + ", relación: " + (n1 / n2);

        for (int i = 3; i <= 40; i++){
            double t = n1 + n2;
            cadenaNum = cadenaNum + ", " + t + ", relación: " + (n2 / n1);
            n1 = n2;
            n2 = t;
        }
        System.out.println(cadenaNum);
    }
}
