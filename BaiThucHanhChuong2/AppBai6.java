package BaiThucHanhChuong2;
import java.util.Scanner;
public class AppBai6 {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            do {
            System.out.println("Moi nhap vao so nguyen: ");
            n = sc.nextInt();
            if(n<1)
            System.out.println("Ban phai nhap lai so n thoa man > 1");
   } while(n<=1);
   int giaiThua=1;
   for(int i=1; i<=n; i++) {
            giaiThua *= i;
   }
   System.out.println("Giai thua cua " + n + " la: " + giaiThua);
        }
    } 
}