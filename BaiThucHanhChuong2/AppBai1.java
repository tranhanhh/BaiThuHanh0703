package BaiThucHanhChuong2;
import java.util.Scanner;
public class AppBai1 {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b;
            System.out.println("Moi nhap so thu nhat: ");
            a = sc.nextInt();
            System.out.println("Moi nhap so thu hai: ");
            b = sc.nextInt();
// cau a
      int Tong = a + b;
      int Tich = a * b;
      int Hieu = a - b;
      System.out.println("Tong cua 2 so vua nhap la: " + Tong); 
      System.out.println("Tich cua 2 so vua nhap la: " + Tich); 
      System.out.println("Hieu cua 2 so vua nhap la: " + Hieu); 
      if(b == 0) {
            System.out.println("Khong thuc hien duoc phep chia: "); 
      } else {
               int Chia = a / b;
            System.out.println("Thuong cua 2 so vua nhap la: " + Chia); 
      }
      int soDu = a % b;
      System.out.println("So du cua 2 so vua nhap la: " + soDu); 
// cau b
     if (a < b) {
            System.out.println(a + "<" + b);  
     } else if(a == b) {
            System.out.println(a + "=" + b);  
     } else {
            System.out.println(a + ">" + b);   
     }
        }

    }
}