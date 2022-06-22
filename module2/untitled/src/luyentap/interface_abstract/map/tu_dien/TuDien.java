package luyentap.interface_abstract.map.tu_dien;

import java.util.*;

public class TuDien {
    private Map<String, String> duLieu = new TreeMap<>();

    // thêm từ
    public String add(String key, String value) {
        return this.duLieu.put(key, value);
    }

    // xoá từ
    public String xoa(String key) {
        return this.duLieu.remove(key);
    }

    // tra từ
    public String traTu(String key) {
        String kq = this.duLieu.get(key);
        return kq;
    }
// in ra
    public void inTK() {
        Set<String> tapHopTK = this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTK.toArray()));
    }

    //lấy ra số lượng từ khoá
    public int soLuong() {
        return this.duLieu.size();
    }

    // pulic xoá tất cả
    public void xoaAll() {
        this.duLieu.clear();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuDien s = new TuDien();
        int num;
        do {
            System.out.println("-----Menu-------");
            System.out.println("1. thêm từ điển \n" +
                    "2.  xoá từ điển \n" +
                    "3.  tra từ điển \n"+
                    "4.  in từ điển \n" +
                    "5.  in số lượng từ điển \n" +
                    "6.  xoá tất cả \n" +
                    "0.  exit");
            System.out.println("nhập chức năng muốn chọn");
            num = Integer.parseInt(scanner.nextLine());

            switch (num){
                case 1:
                    System.out.println("nhập từ điển muốn thêm");
                    String k = scanner.nextLine();
                    String v = scanner.nextLine();
                    s.add(k,v);
                    break;
                case 2:
                    System.out.println("nhập từ điển muốn xoá");
                     k = scanner.nextLine();
                    s.xoa(k);
                    break;
                case 3:
                    System.out.println("nhập từ điển muốn tra");
                    k = scanner.nextLine();
                    System.out.println(s.traTu(k));
                    break;
                case 4:
                   s.inTK();
                   break;
                case 5:
                    System.out.println("số lượng từ điển : "+s.soLuong());
                    break;
                case 6:
                    s.xoaAll();
            }
        }while ( num != 0);
    }


}
