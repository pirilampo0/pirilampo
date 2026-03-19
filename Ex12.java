import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        double a1, a2, media;
        System.out.println("Digite as notas das avaliações.");
        a1 = oie.nextDouble();
        a2 = oie.nextDouble();
        media = (a1 + a2) / 2;
        System.out.println("A média do aluno é: " + media);

        if (media > 6.0) {
            System.out.println("O aluno foi aprovado.");
        
        }
        else {
            System.out.println("O aluno não foi aprovado.");
        }
    }
}
