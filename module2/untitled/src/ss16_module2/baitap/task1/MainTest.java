package ss16_module2.baitap.task1;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {

            List<String> list =ReadAndWrite.readFile("src/ss16_module2/task1/file.txt");
            ReadAndWrite.writeFile(list, "src/ss16_module2/task1/result.txt");
        }
    }

