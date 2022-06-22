package ss12_module2.baitap.service;

import ss12_module2.baitap.Model.Product;

public interface IProduct {
    void add();
    void display();
    void edit(int id);
    boolean remove(Product product);
    void search(String name);
    void sort();
}
