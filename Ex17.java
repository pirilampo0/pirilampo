import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        System.out.println("Informe a idade em anos: ");
        int idade = oie.nextInt();
        System.out.println("Informe os meses");
        int meses = oie.nextInt();
        System.out.println("Informe os dias: ");
        int dias = oie.nextInt();
        int totalDIas = (idade * 365) + (meses * 30) + dias;
        System.out.println("A idade em dias é: " + totalDIas);
    }
}