package BaiThucHanhChuong2;
import java.util.Scanner;
public class AppBai5 {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            int sum =0;
            do {
                System.out.println("Moi nhap vao so nguyen bat ky: ");
                n = sc.nextInt();
                sum += n;
            }
            while (sum < 100);
            System.out.println("Tong cac so nguyen vua nhap là: "+ sum);
        }
        
    }
    
}