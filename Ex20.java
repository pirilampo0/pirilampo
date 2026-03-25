import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        double valorMaça = 1.50;
        double valorMaçaDesc = 1.30;
        System.out.println("Digite a quantidad de maçãs:");
        int quantMaça = oie.nextInt();
        if (quantMaça < 12) {
            double valorTotal = quantMaça * valorMaça;
            System.out.println("O valor total é R$ " + valorTotal);
        } else {
            double valorTotal = quantMaça * valorMaçaDesc;
            System.out.println("O valor total é R$ " + valorTotal);
            
        }
    }
}
