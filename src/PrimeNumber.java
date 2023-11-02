public class PrimeNumber {

    public static void isPrimeNumber(int prime) {


        for (int i = 2; i * i <= prime; i++) {
            if (prime % i == 0) {
                System.out.println(false);
                break;
            }
        }

    }
}
