package Candidate;

import java.util.Scanner;

public class Candidate {
    private int id;
    private int  date ;
    private String name ;
    private double Toan ;
    private double  Van;
    private double Anh ;

    public Candidate() {
    }

    public Candidate(int id,String name , int date, double toan, double van, double anh) {
        this.id = id;
        this.date = date;
        this.name = name ;
        Toan = toan;
        Van = van;
        Anh = anh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int  getDate() {
        return date;
    }

    public void setDate(int  date) {
        this.date = date;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double toan) {
        Toan = toan;
    }

    public double getVan() {
        return Van;
    }

    public void setVan(double van) {
        Van = van;
    }

    public double getAnh() {
        return Anh;
    }

    public void setAnh(double anh) {
        Anh = anh;
    }

    public double getSum(){
        return (getAnh()+getToan()+getVan()) / 3 ;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", Toan=" + Toan +
                ", Van=" + Van +
                ", Anh=" + Anh +
                "có điêm trung bình : "+ getSum()+
                '}';
    }
}
