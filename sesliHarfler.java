import java.util.Scanner;
public class sesliHarfler {
    public static void main(String[]args){

        Scanner input =new Scanner(System.in);
        System.out.print("Sesli bir  harf giriniz:");
        String harf=input.nextLine();

        switch (harf) {
            case "A":
            case "O":
            case "U":
            case "I":
                System.out.println("kalın  bir harftir.");
                break;
            default:
                System.out.println(" ince  bir harftir ");
        }





    }
}
