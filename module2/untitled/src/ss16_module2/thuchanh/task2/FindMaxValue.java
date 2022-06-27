package ss16_module2.thuchanh.task2;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/ss16_module2/thuchanh/task2/number.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src/ss16_module2/thuchanh/task2/result.txt", maxValue);
    }
}
