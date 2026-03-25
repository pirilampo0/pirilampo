import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        System.out.println("Dê o valor do numerador: ");
        double numerador = oie.nextDouble();
        System.out.println("Dê o valor do denominador: ");
        double denominador = oie.nextDouble();

        if (denominador == 0) {
            System.out.println("Erro.");

        } else {
            double resultado = numerador / denominador;
            System.out.println("O resultado é: " + resultado);
             
        }
       
        
        }

    }

