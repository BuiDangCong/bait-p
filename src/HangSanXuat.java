/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class HangSanXuat {

 private String tenHang;
  private QuocGIa quocGia;

    public HangSanXuat(String tenHang, QuocGIa quocGia) {
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public QuocGIa getQuocGia() {
        return quocGia;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setQuocGia(QuocGIa quocGia) {
        this.quocGia = quocGia;
    }
    

}
