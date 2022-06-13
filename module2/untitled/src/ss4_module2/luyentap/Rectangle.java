package ss4_module2.luyentap;
// chu vi và diện tích hình chữ nhật
public class Rectangle {
    private int width , height ;
    public  Rectangle(){

    }
    public   Rectangle(int width , int height){
        this.width = width ;
        this.height = height ;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getDienTich(){
        return this.width * this.height;
    }
    public int getChuVi(){
        return (this.width+this.height) * 2 ;
    }
}
