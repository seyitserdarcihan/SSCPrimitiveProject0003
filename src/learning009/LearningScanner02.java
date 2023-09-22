package learning009;

import java.util.Scanner;

public class LearningScanner02 {

    public static void main(String[] args) {

        // Kullanıcıya doğum yılını sorup sonra
        // doğum tarihini yazdıran bir kod oluşturun

        // 1. Adım: Bir scanner objesi oluşturmak

        Scanner scan = new Scanner(System.in);

        // 2. Adım: Kullanıcıya ondan ne veri girişi (input) istediğimizi
        // kullanıcıya söylemek

        System.out.println("Lütfen isminizi ve doğum yılınızı yazınız: ");

        // 3. Adım: Kullanıcıdan veri girişini (input) alıp
        // bu veriyi bir değişkene atamak

        String isim = scan.nextLine();                  //next ile başlayan metotlar vasıtasıyla
       // short dogumYili = scan.nextShort();           //kullanıcıdan veri girişi alınır


        String dogumYili = scan.next();

        System.out.print("İsminiz ve doğum yılınız: " + isim +", "+ dogumYili);

        scan.close();

    }
}

// Eğer farklı çıktı değerleri arasında boşluk olmasını istiyorsan,
// Satır 30'da isim ve dogumYili değişkenleri arasında yer alan koda dikkat et.



// Sınıf isimlerini büyük harfle başlat ve
// birden fazla kelimeyi deve hörgücü yöntemi ile
// yaz

