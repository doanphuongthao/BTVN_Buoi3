package org.example;

public class VanDongVien {

    String HoTen;
    int Tuoi;
    float CanNang;
    float ChieuCao;

    public VanDongVien(){

    }
    public VanDongVien(String HoTen, int Tuoi,  float ChieuCao, float CanNang){
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.CanNang = CanNang;
        this.ChieuCao = ChieuCao;
    }

    public boolean SoSanh(VanDongVien v1, VanDongVien v2){
        if(v1.ChieuCao > v2.ChieuCao){
            return true;
        }
        else if(v1.ChieuCao == v2.ChieuCao){
            if(v1.CanNang >= v2.CanNang)
                return true;
            else return false;
        }
        else return false;
    }

    public void showVDV(){
        System.out.println("Ho Ten: "+ this.HoTen + " Tuoi: "+ this.Tuoi+ " Chieu Cao: "+ this.ChieuCao+" Can Nang: "+ this.CanNang);
    }

    public static VanDongVienBuilder create(){
        return new VanDongVienBuilder();
    }

    public static class VanDongVienBuilder {
        public String HoTen;
        public int Tuoi;
        public float CanNang;
        public float ChieuCao;

        public VanDongVienBuilder withName(String HoTen){
            this.HoTen = HoTen;
            return this;
        }
        public VanDongVienBuilder andChieuCao(float ChieuCao){
            this.ChieuCao = ChieuCao;
            return this;
        }

        public VanDongVienBuilder andCanNang(float CanNang){
            this.CanNang = CanNang;
            return this;
        }

        public VanDongVienBuilder andTuoi(int tuoi){
            this.Tuoi = tuoi;
            return this;
        }

        public VanDongVien Build(){
            return new VanDongVien(this.HoTen, this.Tuoi, this.ChieuCao, this.CanNang);
        }
    }


}
