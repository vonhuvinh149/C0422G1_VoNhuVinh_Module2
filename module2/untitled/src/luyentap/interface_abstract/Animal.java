package luyentap.interface_abstract;

public abstract class Animal implements MyInterface{
    private String SomeProperty ;
    protected float OtherProperty ;
    public abstract void move();
    public abstract void eat();

    public Animal(String someProperty, float otherProperty) {
        SomeProperty = someProperty;
        OtherProperty = otherProperty;
    }

    public Animal() {
    }

    @Override
    public void saySomething(int something) {

    }
}
