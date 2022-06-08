package ss2.module2.baitap;
public class primenumber {
    public static void main(String[] args) {
        int count = 0;
        int numBer = 2;
        int divisor = 0;
        // if (num < 1000) {
        while (count < 20) {
            for (int i = 2; i < numBer; i++) {
                if (numBer % i == 0) {
                    divisor++;
                    break;
                }
            }
            if (divisor == 0) {
                System.out.println(numBer);
                count++;
            }
            numBer++;
            divisor = 0;
        }
    }
}
