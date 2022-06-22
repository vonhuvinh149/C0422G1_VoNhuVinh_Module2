package luyentap.interface_abstract;

public class fizz extends Animal{
    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }



    @Override
    public String toString() {
        return "fizz{" +
                "OtherProperty=" + OtherProperty +
                '}';
    }

    @Override
    public void saySomething(int something) {
        if (something >= 0){
            System.out.println("ngu");
        }else{
            System.out.println("hehe");
        }
    }
}
