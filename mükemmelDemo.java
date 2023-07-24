import java.util.Scanner;
public class mükemmelDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0;
        int point ;
        System.out.println("Bir sayı giriniz:");
        point = input.nextInt();

        for (int i = 1; i < point; i++) {
            if (point % i == 0) {
                toplam = toplam + i;
                System.out.println(toplam );

            }


        }
        if (point== toplam) {
            System.out.println(point +" mükemmel sayıdır ");
        } else {
            System.out.println(point+" mükemmel sayı değildir");
        }

    }
}

