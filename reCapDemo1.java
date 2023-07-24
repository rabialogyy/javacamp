public class reCapDemo1 {
    public static void main(String[]args){
        int sayi1=5 , sayi2=362, sayi3=55;

       /* if(sayi1>sayi2  && sayi1>sayi3 )){
            System.out.println("En büyük sayı :"+sayi1) ;
        } else if (sayi2 > sayi1 && sayi2>sayi3 ) {
            System.out.println("En büyük sayı :"+sayi2);

        } else if (sayi3 > sayi1 && sayi3>sayi2) {
            System.out.println("En büyük sayı :" + sayi3);
        }

        */
        int enBuyuk=sayi1 ;

        if (enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if (enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
        System.out.println("En büyük sayı:"+enBuyuk);


    }
}
