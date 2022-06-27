package luyentap.interface_abstract.docfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class docfile {
    public static void main(String[] args) throws IOException {


//        cách 1 :
//        File f = new File("D:\\codegym\\thu muc git\\C0422G1_VoNhuVinh_Module2\\module2\\untitled\\src\\luyentap\\interface_abstract\\docfile\\vonhuvinh.txt");
//        try {
//            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//            String line  = null ;
//            while (true){
//                line = br.readLine();
//                if (line == null) {
//                    break;
//                }else {
//                    System.out.println(line);
//                }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // cách 2:
//        File f2 = new File("D:\\codegym\\thu muc git\\C0422G1_VoNhuVinh_Module2\\module2\\untitled\\src\\luyentap\\interface_abstract\\docfile\\vonhuvinh.txt");
//        try {
//            List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
//            for (String line : allText) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        File f2 = new File("D:\\codegym\\thu muc git\\C0422G1_VoNhuVinh_Module2\\module2\\untitled\\src\\luyentap\\interface_abstract\\docfile\\vonhuvinh.txt");
      try {
          List<String> allText = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
          for (String line: allText){
              System.out.println(line);
          }
      }catch (Exception e){
          e.printStackTrace();
      }
    }
}
