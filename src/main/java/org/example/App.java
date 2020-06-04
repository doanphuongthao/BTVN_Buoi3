package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       //Khai báo p là đối tượng lớp Vandongvien (sử dụng hàm thiết lập 5 tham số), hiển thị thông tin của p ra màn hình
        VanDongVien p = VanDongVien.create().withName("Le Hoa").andTuoi(24).andChieuCao(161).andCanNang(53).Build();
        p.showVDV();

        //Nhap vao mot mang gom n cau thu
        System.out.println("***********************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong cau thu: ");
        int n= sc.nextInt();
        CauThu[] arrCauThu = new CauThu[n];
        for (int i = 0; i<n; i++){
            System.out.println("Nhap Cau thu thu "+ (i+1) +" :");
            arrCauThu[i] = CauThu.input();

        }
        //in ra danh sach cac cau thu
        System.out.println("***********************************************");
        System.out.println("Danh sach cau thu: ");
        for (int i=0; i<n; i++){
            arrCauThu[i].showCauThu();
        }

        //Sap xep mang da nhap theo thu tu tang dan va hien thi ra man hinh
        CauThu temp = new CauThu();
        for (int i = 0; i<n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (temp.SoSanh(arrCauThu[i],arrCauThu[j])){
                    temp = arrCauThu[j];
                    arrCauThu[j] = arrCauThu[i];
                    arrCauThu[i] = temp;

                }
            }
        }
        System.out.println("***********************************************");
        System.out.println("Sau khi sap xep theo thu tu tang dan:");
        for (int i = 0; i<n ; i++){
            System.out.println("Cau Thu thu "+i+" :");
            arrCauThu[i].showCauThu();
        }
    }
}
