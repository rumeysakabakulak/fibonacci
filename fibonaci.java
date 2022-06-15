import java.util.Scanner;
public class fibonaci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Eleman Sayısını Giriniz : ");
        int sayi = inp.nextInt();

        int toplam = 0, n1 = 0, n2 = 1;

        System.out.print(n1 + " " + n2 + " ");
        for ( int i = 2; i < sayi; i++) {
            toplam = (n1 + n2);
            System.out.print(toplam + " ");
            n1 = n2;
            n2 = toplam;
        }
    }
}
