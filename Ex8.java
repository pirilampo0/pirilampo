import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        int metro, centimetro;
        System.out.println("Digite a quantidade em M: ");
        metro = oie.nextInt();
        centimetro = metro * 100;
        System.out.println("A quantidade em cm é: " + centimetro);
    }
}