package ss12_module2.baitap;

import java.io.*;

public class TestReadAnWrite {
    public static void main(String[] args) {
        // triễn khai ghi file với 1 chuỗi
        File file = new File("src/ss12_module2/baitap/demo.txt");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            // ghi 1 chuỗi vào file
            bufferedWriter.write("hello codegym1");
            bufferedWriter.newLine();
            bufferedWriter.write("hello codegym2");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // đọc file
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
    }
}
