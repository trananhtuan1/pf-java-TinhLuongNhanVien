import java.util.Scanner;

public class Tinhluong {
    public static void main(String[] args) {
        int luongthang;
        int hesoluong;
        int sonamlamviec;

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập hệ số lương:");
        hesoluong = scanner.nextInt();
        System.out.println("nhập số năm làm việc :");
        sonamlamviec = scanner.nextInt();

        luongthang = hesoluong * 4000000 + sonamlamviec * 500000;


        if (hesoluong >= 1 && hesoluong <= 5) {
            if (sonamlamviec < 0) {
                System.out.println("lỗi mời nhập lại");
            } else {
                System.out.println("lương tháng :" + luongthang);
            }
        }else{
            System.out.println("Lỗi mời nhập lại");
        }

    }

}
