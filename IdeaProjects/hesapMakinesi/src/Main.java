//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        topla topla1 = new topla();
        cikar cikar1 = new cikar();
        carp carp1 = new carp();
        bol bol1 = new bol();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yapılmasını istediğiniz işleme göre numara giriniz: " +
                "toplama = 1, çıkarma = 2, çarpma=3, bölme=4" );

        int sayi = scanner.nextInt();
        System.out.println("Sayıları giriniz");
        int sayibir = scanner.nextInt();
        int sayiiki = scanner.nextInt();
        int sonuc;
        switch (sayi) {
            case 1:
                sonuc = topla1.islem(sayibir,sayiiki);
                System.out.println("Cevap: " +sonuc );
                break;
            case 2:
                sonuc = cikar1.islem(sayibir,sayiiki);
                System.out.println("Cevap: " +sonuc );
                break;
            case 3:
                sonuc = carp1.islem(sayibir,sayiiki);
                System.out.println("Cevap: " +sonuc );
                break;
            case 4:
                sonuc =bol1.islem(sayibir,sayiiki);
                System.out.println("Cevap: " +sonuc );
                break;
                default:
                    System.out.println("girdiğiniz işlem kodu hatalı");
        }

    }
}