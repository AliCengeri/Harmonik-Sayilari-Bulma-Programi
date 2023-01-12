import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        double snc = 0;
        System.out.print("Sayıyı Giriniz: ");
        a = input.nextInt();
        for (double b = 1; b <= a; b++) {
            snc += (1 / b);
        }
        System.out.println("Sonuç: " + snc);
    }
}