package arraylist;

import java.util.ArrayList;

  public  class danhsachsv {
    private ArrayList<sinhvien> danhsach ;

    public danhsachsv(ArrayList<sinhvien> danhsach) {
        this.danhsach = danhsach;
    }

    public danhsachsv() {
        this.danhsach = new ArrayList<sinhvien>();
    }
    public void themsv(sinhvien sv){
        this.danhsach.add(sv);
    }
    public void indanhsach(){
        for (sinhvien x: danhsach){
            System.out.println(x);
        }
    }

      @Override
      public String toString() {
          return "danhsachsv{" +
                  "danhsach=" + danhsach +
                  '}';
      }
  }
