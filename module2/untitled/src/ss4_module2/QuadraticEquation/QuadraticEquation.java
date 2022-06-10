package ss4_module2.QuadraticEquation;

public class QuadraticEquation {
    int a , b , c ;
    public QuadraticEquation(int a , int b , int c){
        this.a = a ;
        this.b = b ;
        this.c = c ;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }
    public int getDiscriminant(){
        return (this.b * this.b ) - (4*this.a * this.c) ;
    }

    public double getRoot1(){
        return ((-this.b + Math.sqrt(getDiscriminant())) / 2 * a)  ;
    }
    public double getRoot2(){
        return ((-this.b - Math.sqrt(getDiscriminant())) / 2 * a)  ;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
}
