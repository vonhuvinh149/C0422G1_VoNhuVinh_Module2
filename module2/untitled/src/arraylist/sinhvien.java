package arraylist;

public class sinhvien {
    private String id ;
    private String name ;
    private int date ;
    private double trungbinh ;

    public sinhvien() {
    }

    public sinhvien(String id, String name, int date, double trungbinh) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.trungbinh = trungbinh;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getTrungbinh() {
        return trungbinh;
    }

    public void setTrungbinh(double trungbinh) {
        this.trungbinh = trungbinh;
    }
}
