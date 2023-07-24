public class miniAsalSayı {
    public static void main(String[] args) {
        int number = 1;

        boolean isPrime = true;
        if(number==1){
            System.out.println("Sayı asal değildir");
            return ;
        }

        if(number<2){
            System.out.println(" Geçersiz sayı");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                System.out.println(i);
            }
        }

        if (isPrime) {
            System.out.println(number+" Sayısı asaldır");
        } else {
            System.out.println( number+" Sayısı asal değildir.");
        }

    }
}
