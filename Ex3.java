import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        System.out.println("Digite a temperatura em fahrenheit: ");
        double f = oie.nextDouble();
        double c = (f - 32) * 5.0 / 9.0;
        System.out.println("A temperatura em celsius é: " + c);
    
    }
}