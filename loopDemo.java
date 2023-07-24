public class loopDemo {
    public static void main(String[] args) {
        // for
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti");

        // while
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i+=2;

        }
        System.out.println("while döngüsü bitti");

        // do-while şart sağlanmasa bile bir kere ekrana yazdırılır.
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while (j< 10);
        System.out.println("do-while döngüsü bitti.");


    }
}
