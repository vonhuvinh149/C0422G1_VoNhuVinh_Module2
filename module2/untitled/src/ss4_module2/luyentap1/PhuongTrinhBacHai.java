package ss4_module2.luyentap1;

import com.sun.deploy.security.SelectableSecurityManager;

public class PhuongTrinhBacHai {
    int a , b , c ;
    public PhuongTrinhBacHai(int a , int b , int c ){
        this.a =  a ;
        this.b = b ;
        this.c = c ;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public double getDelta(){
        return Math.pow(this.b , 2) - 4 * a * c;
    }
    public double getRoo1(){
     return  -b / 2* a;
    }
    public double getRoot2(){
        return (-b - Math.sqrt(getDelta())) / (2* a) ;
    } public double getRoot3(){
        return (-b + Math.sqrt(getDelta())) / (2 * a) ;
    }
}
