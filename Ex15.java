import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        int qntAtual, qntMin, qntMax;
        float qntMedia;
        System.out.println("Diga a quantidade atual, minima e maxima do estoque.");

        qntAtual = oie.nextInt();
        qntMin = oie.nextInt();
        qntMax = oie.nextInt();
        qntMedia = (qntMax + qntMin) / 2f;
        System.out.println("A média dos produtos é: " + qntMedia);

        if (qntAtual >= qntMedia) {
            System.out.println("Não efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }

    }
}
