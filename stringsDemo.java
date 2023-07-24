import java.util.Locale;

public class stringsDemo {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";

       /*
        System.out.println("eleman sayısı:"+ mesaj.length());
        System.out.println("5.eleman:"+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın.!")); // mesaja ekleme yapma
        System.out.println(mesaj.startsWith("B")); // mesajın hangi harfle başaladığını sorgulama
        System.out.println(mesaj.endsWith("!"));    //mesajın ne ile bittiğini sorgular.
        char[]karakterler=new char[5];
        mesaj.getChars(0,4,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); // baştan arama
        System.out.println(mesaj.lastIndexOf('a')); // sondan arama

        */
        String yeniMesaj=mesaj.replace(' ','-'); // karakterleri değiştirme
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5)); // belirtilen indisten itibaren istenilen indise kadar ekrana yazdırır ikinci indis yoksa hepsini yazar

        for(String kelime:mesaj.split(" ")) // string ifadeyi liste halınde ekrana yazdırır.
        System.out.println(kelime);

        System.out.println(mesaj.toLowerCase()); // büyük harfleri küçük harfe çevirme
        System.out.println(mesaj.toUpperCase()); // küçük harfleri büyük harflere çevirme
        System.out.println(mesaj.trim()); // baştaki ve sondaki boşlukları atma



    }
}
