public class sayıbulma {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int wanted = 5;
        boolean varMi = false;
        for (int sayi : numbers) {
            if (sayi == wanted) {
                varMi = true;
                break;
            }

        }
        if (varMi) {
            System.out.println("Sayı mevcuttur");
        } else {
            System.out.println("Sayı mevcut değildir");
        }
    }
}
