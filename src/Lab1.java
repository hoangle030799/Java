import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Name: ");
//        String name = scanner.next();
//        System.out.println("Age: ");
//        int age = scanner.nextInt();
//        System.out.println("My name is: " + name + ", age: " + age);
//        scanner.close();

        //hàm math
//        System.out.println("First number: ");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Second number: ");
//        int secondNumber  = scanner.nextInt();
//        System.out.println("Min: " + Math.min(firstNumber , secondNumber));
//        System.out.println("Max: " + Math.max(firstNumber , secondNumber));

        //Bài 1: Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
//        System.out.println("Tên sinh viên: ");
//        String tenSV = scanner.next();
//        System.out.println("Điểm trung bình: ");
//        float diemTB = scanner.nextFloat();
//        System.out.println("Tên sinh viên: " + tenSV + "\n" + "Điểm trung bình: " + diemTB);

        //Bài 2: Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
        //Tính toán và in ra console:
        //- chu vi hình chữ nhật
        //- diện tích hình chữ nhật
        //- cạnh nhỏ nhất của hình chữ nhật

        System.out.println("Chiều dài của hình chữ nhật: ");
        Float cd = scanner.nextFloat();
        System.out.println("Chiều rộng của hình chữ nhật: ");
        Float cr = scanner.nextFloat();
        System.out.println("Chu vi hình chữ nhật là: " + (cd + cr) * 2);
        System.out.println("Diện tích hình chữ nhật là: " + cd * cr);
    }
}
