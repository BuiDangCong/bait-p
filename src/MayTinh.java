/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class MayTinh {

    private HangSanXuat hangSanXuat;
    private NgaySanXuat ngaySanXuat;
    private int giaBan, thoiGianBaoHanh;

    public MayTinh(HangSanXuat hangSanXuat, NgaySanXuat ngaySanXuat, int giaBan, int thoiGianBaoHanh) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public NgaySanXuat getNgaySanXuat() {
        return ngaySanXuat;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    
 public boolean checkGia (MayTinh mayKhac){
     return this.getGiaBan() == mayKhac.giaBan;
    }
 public String getNameCountry(){
    
     return this.hangSanXuat.getQuocGia().getTenQuocGia();
 
 
 }
    
    
    
    
    
}
