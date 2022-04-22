
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class BaiThucHanh1803 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Person b=new Person();
        System.out.println("============nhap thong tin PerSon============");
        b.input();
        b.output();
        SinhVien a = new SinhVien();
        System.out.println("============nhap thong tin sinh vien============");       
        a.inputStudent();
        a.outputStudent();
    }

}
