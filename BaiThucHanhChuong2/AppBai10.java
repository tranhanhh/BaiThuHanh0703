package BaiThucHanhChuong2;
import java.util.Scanner;
public class AppBai10 {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {
            String chuoi;
            char kitu;
            int dem =0;
            do {
            System.out.println("Moi nhap vao chuoi bat ky: ");
            chuoi = sc.nextLine();
            } while(chuoi.length()>80);
            System.out.println("Moi nhap vao 1 ky tu bat ky: ");
            kitu=sc.next().charAt(0);
            char A[]=chuoi.toCharArray();
            for(int i=0;i<A.length;i++)
            {
            	if(A[i]==kitu)
            	{
            		dem++;
            	}
            }
            System.out.println(" Ky tu " + kitu + " xuat hien " + dem + " lan trong chuoi vua nhap ");
        }
	}

}