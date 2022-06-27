package ss16_module2.baitap.task2;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Countries> list = ReadAndWrite.readFile("src/ss16_module2/baitap/task2/file.txt");
        for (Countries c : list) {
            System.out.println(c);
        }
    }
}
