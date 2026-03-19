import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        System.out.println("Digite um nmr inteiro: ");
        int a = oie.nextInt();
        double vAtu = a * 1.20;
        System.out.println("O valor atualziado é: " + vAtu);


    }
}