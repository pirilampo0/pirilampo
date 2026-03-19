import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        double n1, n2, media;
        System.out.println("Digite as notas:");
        n1 = oie.nextDouble();
        n2 = oie.nextDouble();
        media = (n1 + n2) / 2;
        System.out.println("A média é: " + media);
    }
}
