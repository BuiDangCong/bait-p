
import java.awt.BorderLayout;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {
        QuocGIa country1 = new QuocGIa("93", "Viet Nam");
        QuocGIa country2 = new QuocGIa("94", "laos");
        QuocGIa country3 = new QuocGIa("95", "Cambodia");
        NgaySanXuat day1 = new NgaySanXuat(15, 5, 2000);
        NgaySanXuat day2 = new NgaySanXuat(16, 6, 2003);
        NgaySanXuat day3 = new NgaySanXuat(17, 7, 2004);
        HangSanXuat manufacturer1 = new HangSanXuat("coca1", country1);
        HangSanXuat manufacturer2 = new HangSanXuat("coca2", country2);
        HangSanXuat manufacturer3 = new HangSanXuat("coca3", country3);
        MayTinh mT1 = new MayTinh(manufacturer1, day1, 50000, 24);
        MayTinh mT2 = new MayTinh(manufacturer2, day2, 60000, 25);
        MayTinh mT3 = new MayTinh(manufacturer3, day3, 70000, 27);
        System.out.println("gia may 1 lon hon gia may 2 " + mT1.checkGia(mT2) );
        System.out.println("ten quoc gia san xuat may tinh 1 la : " + mT1.getNameCountry() );
    }
}
