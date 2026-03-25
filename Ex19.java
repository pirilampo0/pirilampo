import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        
        System.out.println("Quanto recebe p/ hora: ");
        double salarioHora = oie.nextDouble();
        
        System.out.println("O numero de horas trabalhadas no mes:");
        double horasMes = oie.nextDouble();
        
        System.out.println("Percentual de imposto: ");
        double percentualImp = oie.nextDouble();
       
        double salarioBruto = salarioHora * horasMes;
        double desconto = salarioBruto * (percentualImp/ 100);
        double salarioLiquido = salarioBruto - desconto;
       
        System.out.printf("Salário bruto:    R$ %.2f%n", salarioBruto);
        System.out.printf("Imposto (%s%%):    R$ %.2f%n", percentualImp, desconto);
        System.out.printf("Salário líquido:  R$ %.2f%n", salarioLiquido);
    }
}