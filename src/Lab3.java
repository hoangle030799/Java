import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        //Vòng for
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

        //Voòng while (do-while thì sẽ ưu tiên chạy trước rồi mới check điều kiện)

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }

        //break, continue (break: đến vị trí đó thì out, continue: đến vị trí đó thì bỏ qua)

//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//                break;
//            }
//            System.out.println(i);
//        }

        //Arr

//        String[] fr = {"Hoàng", "Hiếu", "Phương"};
//        for (int i = 0; i < fr.length; i++) {
//            System.out.println(fr[i]);
//        }
        //Bài tập: sắp xếp thứ tự tăng dần
//        int[] a = {15, 10, 1, 16, 3};
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] > a[j]) {
//                    int k = a[i];
//                    a[i] = a[j];
//                    a[j] = k;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));

        Scanner scanner = new Scanner(System.in);

        //Bài 1: Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số
        //nguyên tố hay không ?

//        System.out.println("Số cần check: ");
//        int a = scanner.nextInt();
//        for (int i = 2; i < a; i++) {
//            if (a % i == 0) {
//                System.out.println("Số " + a + " không phải là số nguyên tố");
//                break;
//            } else {
//                System.out.println("Số " + a + " là số nguyên tố");
//                break;
//            }
//        }

        //Bài 2: Viết bảng cửu chương của 1 số nguyên bất kỳ

//        System.out.println("Bảng cửu chương: ");
//        int a = scanner.nextInt();
//        for (int i = 1; i < 11; i++) {
//            System.out.println(a + "*" + i + "=" + a * i);
//        }

        //Bài 3: Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
        //- Sắp xếp và xuất mảng vừa nhập ra màn hình
        //- Xuất phần tử có giá trị nhỏ nhất
        //- Xuất phần tử có giá trị lớn nhất

        System.out.println("Nhập vào số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ":");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa tạo là: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp là: " + Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println("Phần tử có giá trị lớn nhất là: " + max);
        System.out.println("Phần tử có giá trị nhỏ nhất là: " + min);
    }
}
