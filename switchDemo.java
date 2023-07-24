public class switchDemo {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("MÜKEMMEL : GEÇTİNİZ");
                break;
            case 'B':
                System.out.println("ÇOK GÜZEL :GEÇTİNİZ");
                break;
            case 'C':
                System.out.println("İYİ: GEÇTİNİZ");
                break;
            case 'D':
                System.out.println("FENA DEĞİL: GEÇTİNİZ");
                break;
            case 'F':
                System.out.println("MAALESEF : KALDINIZ");
                break;
            default:
                System.out.println("Geçersiz not");

        }

    }


}
