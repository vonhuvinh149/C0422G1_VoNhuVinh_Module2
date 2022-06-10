package ss4_module2.StopWatch;

import java.util.Arrays;


public class RunStopWatch {
    public static void main(String[] args) {
            int [] array = new int [1000];
            for (int i =0;i<array.length;i++) {
                array[i] = (int)(Math.random());
            }
            System.out.println(Arrays.toString(array));
            Arrays.sort(array);
            StopWatch stopWatch = new StopWatch();
            System.out.println(stopWatch.getElapsedTime());
        }
    }


