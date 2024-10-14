package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTapLab5 {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập vào một số thực bấp kỳ: ");
            Double x = scanner.nextDouble();
            list.add(x);
            scanner.nextLine();
            System.out.println("Continue ??? Y/N");
            String options = scanner.nextLine();
            if (options.equals("Y") || options.equals("n")) {
                break;
            }
        }
        System.out.println("Check array " + list);
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Array sum = " + sum);
    }
}
