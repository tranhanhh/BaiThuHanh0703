package Baithuchanh0703;
import java.util.Scanner;
public class App74 {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            do {
            System.out.println("Moi nhap vao so phan tu cua mang: ");
            n = sc.nextInt();
            } while (n < 0);
            int A[] = new int[n];
            System.out.println("Moi nhap cac phan tu cho mang: ");
            for(int i=0; i<n; i++) {
                    System.out.format("Nhap phan tu thu " + i + ": ");
                    A[i] = sc.nextInt();
                }
            double Tong =0;
            for(int i=0; i<n; i++) {
                if (A[i] % 2 == 0) {
                    Tong=+A[i];
                }
            }
            System.out.println("Tong cac phan tu trong mang la: " + Tong);
        }
    }
  
}
