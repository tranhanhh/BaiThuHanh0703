package BaiThucHanhChuong2;
import java.util.Scanner;
public class AppBai11 {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.println("Moi nhap so luong phan tu cua mang: ");
             n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
            	System.out.println(" Nhap phan tu thu "+ i +" :");
            	arr[i]=sc.nextInt();
            }
            System.out.println("Mang vua nhap la: ");
            for(int i=0; i<n; i++)
            {
            	System.out.print(arr[i]+" ");
            }
            System.out.println();
            for(int i=0; i<n; i++)
            {	for(int j=i+1; j<n; j++)
            	{
            		if(arr[i] > arr[j])
            		{
            			int swap=arr[i];
            			arr[i]=arr[j];
            			arr[j]=swap;
            		}
            	}
            }
            System.out.println("Mang sau khi duoc sap xep la: ");
            for(int i=0; i<n; i++)
            {
            	System.out.print(arr[i]+" ");
            }
        }
		
	}

}