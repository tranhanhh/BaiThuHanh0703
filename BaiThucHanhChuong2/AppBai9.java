package BaiThucHanhChuong2;
import java.util.Scanner;
public class AppBai9 {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {
            String chuoi;
            System.out.println("Moi nhap vao chuoi bat ky: ");
            chuoi = sc.nextLine();
            int kyTuso =0;
            int kyTuhoa =0;
            int kyTuthuong =0;
            int doDaichuoi =chuoi.length();
            for(int i=0;i<doDaichuoi;i++)
            	{
            		if(Character.isUpperCase(chuoi.charAt(i)))
            		{
            			kyTuhoa++;
            		} if(Character.isLowerCase(chuoi.charAt(i)))
            		{
            			kyTuthuong++;
            		} if(Character.isDigit(chuoi.charAt(i))) 
            		{
            			kyTuso++;
            		}
            	}
            int kiTukhac = doDaichuoi - (kyTuhoa + kyTuthuong + kyTuso);
            System.out.println("Ky tu in hoa xuat hien trong chuoi so lan la: " + kyTuhoa);
            System.out.println("Ky tu in thuong xuat hien trong chuoi so lan la: " + kyTuthuong);
            System.out.println("Ky tu so xuat hien trong chuoi so lan la: " + kyTuso);
            System.out.println("Ky tu khac xuat hien trong chuoi so lan la: " + kiTukhac);
        }
	}
}