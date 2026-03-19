import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        System.out.println("Diga dois valores que informarei qual é o maior.");
        int a1, a2;
        a1 = oie.nextInt();
        a2 = oie.nextInt();

        if (a1 > a2) {
            System.out.println("O número maior é: " + a1 + " variavel a1");
        }
        else if (a2 > a1){
            System.out.println("O número maior é: " + a2 + " variavel a2");
        }
        else {
            System.out.println("Os numeros são iguais.");

        }
    }
}
