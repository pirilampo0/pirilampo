import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args){
        Scanner oie = new Scanner(System.in);
        double metro, cent;
        System.out.println("Diga uma quantidade de metros que irei passar para centimetros.");
        metro = oie.nextDouble();
        cent = metro * 100;
        System.out.println("A quantidade em metros é: " + cent + "cm");
    }
}