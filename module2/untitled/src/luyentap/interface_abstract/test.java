package luyentap.interface_abstract;

public class test {
    public static void main(String[] args) {
        Animal a = new cat();
        cat cat = new cat("hello",3);
        fizz fizz = new fizz();
        cat.saySomething(0);
        System.out.println(cat.toString());
        fizz.saySomething(4);
    }
}
