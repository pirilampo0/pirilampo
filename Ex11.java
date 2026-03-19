import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        System.out.println("Dê a idade de um nadador que direi em qual categoria se encaixa.");
        int idade, adulto, juvenil, infantil, mirim;
        idade = oie.nextInt();
        
        if (idade >= 18) {
            System.out.println("O nadador é adulto.");
        }
        if (idade >= 14 && idade < 18) {
            System.out.println("O nadador é juvenil.");
        }
        if (idade >= 9 && idade < 14) {
            System.out.println("O nadador é infantil.");
        }
        if (idade < 9) {
            System.out.println("O nadador é mirim.");
        }
    }    

}
