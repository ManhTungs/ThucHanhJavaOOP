
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class SinhVien extends Person{  
    Scanner sc=new Scanner(System.in);
    String NgaySinh;
    public void inputStudent(){
        Scanner sc=new Scanner(System.in);
        input();
        System.out.print("nhap ngay sinh:");
        NgaySinh=sc.nextLine();
    }
    public void outputStudent(){
        output();
        System.out.println("Ngay sinh:"+NgaySinh);
        
    }
    
}
