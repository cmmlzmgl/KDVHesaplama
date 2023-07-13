import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {

        int input;
        double kdv = 1.18;
        double kdv2 = 1.08;

        Scanner price = new Scanner(System.in);

        System.out.print("Lütfen KDV'sini Hesaplamak İstediğiniz Tutarı Giriniz: ");
        input = price.nextInt();

        if ( input <= 1000)
        {
            double sonuc = input * kdv;
            System.out.print("Girmiş Olduğunuz Tutarın KDV'li Fiyatı: " + sonuc);
        } else {
            double sonuc = input * kdv2;
            System.out.print("Girmiş Olduğunuz Tutarın KDV'li Fiyatı: " + sonuc);
        }
    }
}
