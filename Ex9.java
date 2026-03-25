import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
    Scanner oie = new Scanner(System.in);
    int base, altura, area, perimetro;
    base = oie.nextInt();   
    altura = oie.nextInt();
    area = base * altura;
    perimetro = (base + altura) * (base + altura);
    System.out.println("area: " + area + "perimetro: ") ;
    }
    
}