package ss7_module2.Resizeable.baitap.Resizeable;

public abstract class Shape implements IResizeable {
    private String color = "yellow";

    @Override
    public void resize(double percent) {
        System.out.println("sau khi tăng kích thước");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
