import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        double base, altura, area;
        System.out.println("Informe a largura e altura que darei o valor da area: ");
        base = oie.nextDouble();
        altura = oie.nextDouble();
        area = (base * altura) / 2;
        System.out.println("A area é: " + area + "cm²");


    }
    
}
