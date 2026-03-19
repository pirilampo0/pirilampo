import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        System.out.println("Dê um valor que direi se é positivo ou negativo: ");
        double a = oie.nextDouble();
        if (a >= 0) {
            System.out.println("O numero é positivo.");
        }
        else {
            System.out.println("O numero é negativo.");
        }
    }    
}
