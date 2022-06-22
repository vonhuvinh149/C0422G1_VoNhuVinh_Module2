package luyentap.interface_abstract.Enum;

public class TestEnum {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb = new ThoiKhoaBieu(Enum.Monday, "toán ,lí,hoá");
        ThoiKhoaBieu tkb1 = new ThoiKhoaBieu(Enum.Tuesday, "văn , sử , địa");
        ThoiKhoaBieu tkb2 = new ThoiKhoaBieu(Enum.Monday, "anh, hoá , sinh");
        System.out.println(tkb);
    }
}
