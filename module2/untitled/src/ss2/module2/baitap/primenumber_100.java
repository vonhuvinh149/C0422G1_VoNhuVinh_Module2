package ss2.module2.baitap;

public class primenumber_100 {
    public static void main(String[] args) {
       
        int numBer = 2;
        int count = 0;
        while (numBer < 100) {
            for (int i = 2; i < numBer; i++) {
                if (numBer % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(numBer);
            }
            numBer++;
            count = 0;
    }

}}
