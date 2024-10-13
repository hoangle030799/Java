package Chapter4.BaiTap;

public class pr1 {
    public static void main(String[] args) {
        Product test = new Product();
        Product pr = test.nhapThongTin("Computer", 200, 0.1);
        test.xuatThongTin(pr);
        System.out.println(" tax = " + test.getTaxPrice(pr.getPrice(), pr.getTax()));
    }
}
