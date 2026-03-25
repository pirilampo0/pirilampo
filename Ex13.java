import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        int valorIng, socios, m10, naoSocio, publicoTotal;
        float valorSocios, valorNaoSocio, valorTotal, valorDesconto;

        System.out.println("Diga o valor do ingresso, quantidade de socios, quantidade de não pagantes e pagantes não socios.");
        valorIng = oie.nextInt();
        socios = oie.nextInt();
        m10 = oie.nextInt();
        naoSocio = oie.nextInt();

        publicoTotal = socios + m10 + naoSocio;
        valorSocios = valorIng * socios * 0.70f;    // sócios têm 30% de desconto
        valorNaoSocio = valorIng * naoSocio;        // não sócios pagam integral
        valorTotal = valorSocios + valorNaoSocio;   // m10 não entram no cálculo
        valorDesconto = valorIng * socios * 0.30f;  // o que deixou de ser arrecadado

        System.out.println("O público total é: " + publicoTotal);
        System.out.println("O total arrecadado foi: R$" + valorTotal);
        System.out.println("O valor que deixou de ser arrecadado foi: R$" + valorDesconto);
    }
}