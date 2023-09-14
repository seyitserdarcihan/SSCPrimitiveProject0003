package learning003;

public class Variables001 {

    public static void main(String[] args) {

        int number= 9;
        System.out.println(number);

        number= 19;
        System.out.println(number);

        number= number + 32;                  //Java, 'number' değişkeni için en son atanan değer
        System.out.println(number);           // olan 19 sayısını algıladı:13

        int birthYear, deathYear, lifeTime;
        birthYear= 1892;                              // Satır 16-20 arasında şunu öğrendin,
        deathYear= 1973;                              // Aynı data türündeki birden fazla değişken
        lifeTime= deathYear - birthYear;              // aynı satırda deklare edilip
        System.out.println(lifeTime);                 // sonra tek tek değer ataması yapılabilir


    }

}

        /* Satır 13'te üçüncü defa değer atama işlemi yapıldı, buna dikkat et.
           Bu değer atama yapılırken Satır 13'teki ikinci number kelimesine dikkat et.
           Satır 13'te olan olayın Türkçesi şu:
           "Java! number değişkenime şu yeni değeri ata: number+32"
           Java'nın buna cevabı şu:
           "eşitliğin sol tarafındaki değişkene, yani 'number'a
           number+32 değerini atamak için önce number için atanmış olan en son değerin
           ne olduğunu bulmalıyım."
           Java bunun üzerine Satır 10'a gider ve number değişkeni için atanmış en son değeri
           bulur. Java, Satır 13'e döner ve number=number+32; tambildirimini şuna dönüştürür
           number=19+32;
           Şimdi Java, number için yeni bir değer atayabilir (assignment yapabilir)
           ve yaptı. Görmek için çalıştıra bas.
         */

/*
Tekrar hatırlayalım. Bir sınıfın çalıştırılabilir
olmasını istiyorsan, içinde bir ana metot olmalıdır.
Bunun için sınıf gövdesinin içine "main" yaz,
IntelliJ IDEA otomatikman ana metot (main method) önerecek.
 */


/*
Eğer, bir değişken (variable) sentaksının sadece
deklarasyon kısmını yazarsan da,
Java onu hafızaya kaydeder.
Örneğin:
int number;
Bu üstteki kod parçası bir deklarasyon tambildirimi (declaration statement)
ve eksik değil. Evet, değer (value) eksik ama, eksikten kastım,
hata verecek şekilde eksik olması
ve eksik değil.
Daha sonra başka bir satıra şu kod parçasını yazarsak,
number=9;
aynen şunu yapmış gibi olacak iki ayrı kod parçası birlikte:
int number=9;
Ama şöyle yazamazsın:
int number;
int number=9;
yukarıda dene ve gör. Run yapmayı unutma. IntelliJ IDEA diyecek ki:
variable number is already defined in method main(java.lang.String[])
 */


/*
Tekrar hatırlayalım. print kodunu hızlıca girmek için,
sout yaz ve Enter.
 */
