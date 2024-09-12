import java.util.Scanner;

public class Lob2 {
    public static void bai1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cho phương trình ax + b = 0. Nhập a và b để tìm x");
        System.out.println("a: ");
        float a = scanner.nextFloat();
        System.out.println("b: ");
        float b = scanner.nextFloat();
        if (a == 0 && b == 0) {
            System.out.println("phương trình có vô số nghiệm");
        } else if (a == 0 && b != 0) {
            System.out.println("phương trình vô nghiệm");
        } else {
            System.out.println("x= " + -b / a);
        }
    }

    public static void bai2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cho phương trình ax^2 + bx + c = 0. Nhập a,b,c để tìm x");
        System.out.println("a: ");
        float a = scanner.nextFloat();
        System.out.println("b: ");
        float b = scanner.nextFloat();
        System.out.println("c: ");
        float c = scanner.nextFloat();
        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("phương trình có vô số nghiệm");
            } else if (b == 0 && c != 0) {
                System.out.println("phương trình vô nghiệm");
            } else {
                System.out.println("x= " + -c / b);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("nghiệm kép x = " + -b / (2 * a));
            } else {
                System.out.println("Phương trình có 2 nghiệm riêng biệt: ");
                System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
                System.out.println("x1 = " + (-b - Math.sqrt(delta)) / (2 * a));
            }
        }
    }

    public static void bai3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện: ");
        int soDien = scanner.nextInt();
        int console;
        if (soDien < 0) {
            System.out.println("Ảo à");
        } else if (soDien >= 0 && soDien <= 100) {
            console = soDien * 100;
            System.out.println("Tiền điện là: " + console);
        } else {
            console = 100 * 1000 + (soDien - 100) * 1500;
            System.out.println("Tiền điện là: " + console);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Bài 1: Cho phương trình ax + b = 0
        //Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình trên

        //Bài 2: Cho phương trình: ax^2 + bx + c = 0
        //Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình trên

        // Bài 3: Viết chương trình tính số tiền điện (in kết quả ra console)

        // Tổng kết:
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất               |");
        System.out.println("| 2. Giải phương trình bậc hai                |");
        System.out.println("| 3. Tính số tiền điện                        |");
        System.out.println("| 4. Kết thúc                                 |");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("Chọn tính năng: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.print("Giải phương trình bậc nhất ");
                bai1();
                break;
            case 2:
                System.out.print("Giải phương trình bậc hai ");
                bai2();
                break;
            case 3:
                System.out.println("Tính số tiền điện ");
                bai3();
                break;
            case 4:
                System.out.println("Bạn đã kết thúc chương trình");
                System.exit(0);
        }
    }
}
