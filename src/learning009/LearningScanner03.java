// Kişinin adını, doğum yılını ve ölüm yılını girdiğimizde,
// kişinin yaklaşık olarak kaç yaşında vefat ettiğini
// çıktı olarak veren bir Java kodu

package learning009;

import java.util.Scanner;
public class LearningScanner03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen kişinin ismini, doğum yılını ve ölüm yılını yazınız: ");

        String isim = scan.nextLine();
        short dogumYili = scan.nextShort();       //next ile başlayan metotlar vasıtasıyla
        short olumYili = scan.nextShort();        //kullanıcıdan veri girişi alınır
        int omur = olumYili - dogumYili ;
        String tahmin = "yaklaşık olarak";
        String vefat = "yaşında vefat etmiştir.";
        String yaklasikOmur = tahmin + " " + omur + " " + vefat;

        System.out.println(isim + "," + dogumYili + " yılında doğmuştur ve" + "\n"
                           + olumYili + " yılında " + yaklasikOmur );
        scan.close();

    }
}

