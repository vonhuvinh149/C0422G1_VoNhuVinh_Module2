package ss6_module2.Circle;

public class Cylinder extends Circle{
    private double height ;
    Cylinder(){
        super();
    }
    Cylinder(double height){
        super();
        this.height = height ;
    }

    public double getHeight() {
        return height;
    }

   public double getVolume(){
       return super.getArea() * this.height ;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void getInput(){
        super.getInput();
        System.out.println("nhập chiều cao");
       height = Double.parseDouble(scanner.nextLine());
    }
    @Override
    public String toString(){
      return  "chiều cao :  " + this.height + '\n'+ super.toString() +'\n'+ "thể tích :" + getVolume();
    }
}
