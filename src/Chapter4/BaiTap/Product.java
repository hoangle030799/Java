package Chapter4.BaiTap;

public class Product {
    private String name;
    private double price;
    private double tax;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public Product() {
    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public Product nhapThongTin(String name, double price, double tax) {
        Product pr = new Product(name, price, tax);
        return pr;
    }

    public void xuatThongTin(Product pr) {
        System.out.println(" name = " + pr.getName() + " price = " + pr.getPrice() + " tax= " + pr.getTax());
    }

    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }
}
