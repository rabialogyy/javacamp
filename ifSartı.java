import java.util.Scanner;

public class ifSartı {
    public static void main(String[] args) {
        int sayi;
        int sayi1 = 15;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz:");
        sayi = inp.nextInt();


        if (sayi < sayi1) {
            System.out.println("Girilen sayı " + sayi1 + "'den küçüktür.");
        } else if (sayi == sayi1) {
            System.out.println("Girilen sayı " + sayi1 + "'e eşittir.");

        } else {
            System.out.println("Girilen sayı " + sayi1 + "'den büyüktür.");
        }
    }
}
