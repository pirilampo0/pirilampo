import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner oie = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Digite os números que direi eles em ordem crescente.");
        n1 = oie.nextInt();
        n2 = oie.nextInt();
        n3 = oie.nextInt();
        if (n1 <= n2 && n2 <= n3) {
            System.out.println(n1 + "," + n2 + "," + n3 + ".");
        } else if (n1 <= n3 && n3 <= n2) {
            System.out.println(n1 + ", " + n3 + ", " + n2);
        } else if (n2 <= n1 && n1 <= n3) {
            System.out.println(n2 + ", " + n1 + ", " + n3);
        } else if (n2 <= n3 && n3 <= n1) {
            System.out.println(n2 + ", " + n3 + ", " + n1);
        } else if (n3 <= n1 && n1 <= n2) {
            System.out.println(n3 + ", " + n1 + ", " + n2);
        } else {
            System.out.println(n3 + ", " + n2 + ", " + n1);
        }
    }
}
// Cada if cobre uma das 6 combinações possíveis entre 3 números. O else final pega o último caso (n3 <= n2 <= n1) 