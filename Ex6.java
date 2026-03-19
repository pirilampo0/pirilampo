import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Número total de eleitores: ");
        int totalEleitores = oie.nextInt();

        System.out.print("Votos válidos: ");
        int votosValidos = oie.nextInt();

        System.out.print("Votos em branco: ");
        int votosBrancos = oie.nextInt();

        System.out.print("Votos nulos: ");
        int votosNulos = oie.nextInt();

        // Verificação básica de integridade
        if (votosValidos + votosBrancos + votosNulos > totalEleitores) {
            System.out.println("Erro: A soma dos votos supera o total de eleitores.");
        } else {
            // Cálculo dos percentuais
            double percValidos = (double) votosValidos / totalEleitores * 100;
            double percBrancos = (double) votosBrancos / totalEleitores * 100;
            double percNulos = (double) votosNulos / totalEleitores * 100;

            // Exibição dos resultados
            System.out.println("\n--- Resultado da Eleição ---");
            System.out.printf("Votos Válidos: %d (%.2f%%)\n", votosValidos, percValidos);
            System.out.printf("Votos em Branco: %d (%.2f%%)\n", votosBrancos, percBrancos);
            System.out.printf("Votos Nulos: %d (%.2f%%)\n", votosNulos, percNulos);
            System.out.printf("Abstenção/Outros: %d (%.2f%%)\n", 
                              (totalEleitores - (votosValidos + votosBrancos + votosNulos)),
                              (double)(totalEleitores - (votosValidos + votosBrancos + votosNulos))/totalEleitores * 100);
        }

    }
}
