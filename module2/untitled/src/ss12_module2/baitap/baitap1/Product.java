//package ss12_module2.baitap.baitap1;
//
//import java.util.Objects;
//
//public class Product implements Comparable<Product> {
//    private int id;
//    private String name;
//    private int expiry;
//    private Double price;
//
//    public Product(int id, String name, int expiry, Double price) {
//        this.id = id;
//        this.name = name;
//        this.expiry = expiry;
//        this.price = price;
//    }
//
//    public Product(int id) {
//        this.id = id;
//    }
//
//    public Product() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getExpiry() {
//        return expiry;
//    }
//
//    public void setExpiry(int expiry) {
//        this.expiry = expiry;
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Product = " +
//                "id: " + id +
//                ", name='" + name +
//                ", expiry: " + expiry +
//                ", price: " + price
//                ;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Product product = (Product) o;
//        return Objects.equals(id, product.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//
//    @Override
//    public int compareTo(Product o) {
//        return this.getPrice().compareTo(o.getPrice());
//    }
//}
