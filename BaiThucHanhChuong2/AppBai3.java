package BaiThucHanhChuong2;
import java.util.Scanner;
public class AppBai3 {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {
            int tuoi, nam;
            String ten;
            System.out.println("Moi nhap vao ten: ");
            ten = sc.nextLine();
            System.out.println("Moi nhap vao nam sinh: ");
            nam = sc.nextInt();
            tuoi = 2022 - nam;  
            if (tuoi < 16) {
                System.out.println(" Ban " + ten + " o do tuoi vi thanh nien ");
            } else if (tuoi >= 16 || tuoi < 18) {
                System.out.println(" Ban " + ten + " o do tuoi truong thanh ");
            } else {
                System.out.println(" Ban " + ten + " da gia ");
            }
        }
    }
 
}