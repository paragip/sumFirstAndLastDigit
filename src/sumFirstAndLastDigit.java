public class sumFirstAndLastDigit {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(0));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            
            int lastDigit;
            int lastDigitOriginal = number % 10; // eltároljuk az eredeti szám utolsó számjegyét
            int firstDigit;
            int reverseNumber = 0;

            while (number != 0) { // itt megfordítjuk az eredeti számot, mert szükség lesz rá
                lastDigit = number % 10;
                reverseNumber *= 10;
                reverseNumber += lastDigit;
                number /= 10;
            }
            
            firstDigit = reverseNumber % 10; // az eredeti szám első számjegye = a megfordított szám utolsó számjegyével
            return (firstDigit + lastDigitOriginal);
        }
    }

}
