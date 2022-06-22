package luyentap.interface_abstract;

public  class cat extends Animal {
    public cat(String someProperty, float otherProperty) {
        super(someProperty, otherProperty);
    }

    public cat() {
    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }



    @Override
    public void saySomething(int something) {
        if (something > 0 ){
            System.out.println("vo nhu vinh");
        }else{
            System.out.println("vo nhu vinh`149");
        }
    }

    @Override
    public String toString() {
        return "cat{" +
                "OtherProperty=" + OtherProperty +
                '}';
    }
}
