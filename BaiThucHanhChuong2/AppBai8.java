package BaiThucHanhChuong2;
import java.util.Scanner;
public class AppBai8 {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {
            int n, a;
            System.out.println("Moi nhap vao so cac so nguyen co trong day: ");
            n = sc.nextInt();
            int tong = 0;
            for(int i=1; i<=n; i++) {
                System.out.println(" Moi nhap so thu " + i + ": ");
                a = sc.nextInt();
                tong += a;
            }
            int trungBinhcong = tong / n;
            System.out.println(" Trung binh cong cua n so nguyen da nhap la: " + trungBinhcong);
        }
    }
}