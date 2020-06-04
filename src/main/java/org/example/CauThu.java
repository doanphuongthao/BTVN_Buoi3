package org.example;

import java.util.Scanner;

public class CauThu extends VanDongVien {
    public String Caulacbo;
    public int LuongTuan;

    public CauThu(){

    }
    public CauThu(String HoTen, int Tuoi, float CanNang, float ChieuCao, String Caulacbo, int LuongTuan) {
        super(HoTen, Tuoi, ChieuCao, CanNang);
        this.Caulacbo =Caulacbo;
        this.LuongTuan = LuongTuan;
    }

    public boolean SoSanh(CauThu c1, CauThu c2){
        if(c1.LuongTuan > c2.LuongTuan)
            return true;
        else if(c1.LuongTuan <c2.LuongTuan)
            return false;
        else return super.SoSanh(c1, c2);
    }

    public static CauThuBuilder createCT(){
        return new CauThuBuilder();
    }

    public static class CauThuBuilder {
        String HoTen;
        int Tuoi;
        float CanNang;
        float ChieuCao;
        String Caulacbo;
        int LuongTuan;

        public CauThuBuilder withName(String HoTen){
            this.HoTen = HoTen;
            return this;
        }
        public CauThuBuilder andChieuCao(float ChieuCao){
            this.ChieuCao = ChieuCao;
            return this;
        }

        public CauThuBuilder andCanNang(float CanNang){
            this.CanNang = CanNang;
            return this;
        }

        public CauThuBuilder andTuoi(int tuoi){
            this.Tuoi = tuoi;
            return this;
        }

        public CauThuBuilder andCLB(String Caulacbo){
            this.Caulacbo = Caulacbo;
            return this;
        }

        public CauThuBuilder andLuong(int LuongTuan){
            this.LuongTuan = LuongTuan;
            return this;
        }
        public CauThu Build(){
            return new CauThu(this.HoTen, this.Tuoi, this.ChieuCao, this.CanNang, this.Caulacbo, this.LuongTuan);
        }
    }

    public static CauThu input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: \n");
        String HoTen = sc.nextLine();
        System.out.println("Tuoi: \n");
        int Tuoi = sc.nextInt();
        System.out.println("Chieu cao: \n");
        float ChieuCao = sc.nextFloat();
        System.out.println("Can Nang: \n");
        float CanNang = sc.nextFloat();
        sc.nextLine();
        System.out.println("Cau lac bo: \n");
        String Caulacbo = sc.nextLine();
        System.out.println("Luong Tuan: \n");
        int LuongTuan = sc.nextInt();
        CauThu c = CauThu.createCT().withName(HoTen).andTuoi(Tuoi).andChieuCao(ChieuCao).andCanNang(CanNang).andCLB(Caulacbo).andLuong(LuongTuan).Build();
        return c;
    }

    public void showCauThu(){
        System.out.println("Ho Ten: "+ this.HoTen + " Tuoi: "+ this.Tuoi+ " Chieu Cao: "+ this.ChieuCao +" Can Nang: "+ this.CanNang + " Cau lac bo: "+ this.Caulacbo + " Luong tuan: "+ this.LuongTuan);
    }

}
