package ss17_module2.baitap.bai2;

import ss17_module2.baitap.bai1.common.ReadAndWriteBinaryFile;
import ss17_module2.baitap.bai1.model.Product;

import java.io.File;
import java.util.List;

public class CoppyFile {
        public static void copyBinaryFile(String sourceFile,String targetFile){
           List<Product> products = ReadAndWriteBinaryFile.readBinaryFile(sourceFile);
            ReadAndWriteBinaryFile.writeBinaryFile(products,targetFile);
        }

        public static void main(String[] args) {
            final String SOURCE_FILE = "ssrc/ss17_module2/baitap/bai1/common/product.dat";
            final String TARGET_FILE = "src/ss17_module2/baitap/bai2/target.data";
            copyBinaryFile(SOURCE_FILE,TARGET_FILE);
            File file =new File(TARGET_FILE);
            System.out.println(  file.length());
        }


    }

